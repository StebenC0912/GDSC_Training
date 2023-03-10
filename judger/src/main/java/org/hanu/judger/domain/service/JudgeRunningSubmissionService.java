package org.hanu.judger.domain.service;

import org.hanu.judger.domain.config.RunningSubmissionConfig;
import org.hanu.judger.domain.model.RunningSubmission;
import org.hanu.judger.domain.model.Scheduler;
import org.hanu.judger.domain.model.*;
import org.hanu.judger.domain.publisher.SubmissionEventPublisher;
import org.hanu.judger.domain.repository.ProblemRepository;
import org.hanu.judger.domain.repository.RunningSubmissionRepository;
import org.hanu.judger.domain.repository.SubmissionRepository;
import org.hanu.judger.domain.repository.TestCaseRepository;
import org.hanu.judger.domain.vm.VirtualMachine;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class JudgeRunningSubmissionService {
    private final ThreadPoolExecutor executor;
    private final RunningSubmissionRepository runningSubmissionRepository;
    private final TestCaseRepository testCaseRepository;
    private final VirtualMachine virtualMachine;
    private final ProblemRepository problemRepository;
    private final SubmissionRepository submissionRepository;
    private final SubmissionEventPublisher submissionEventPublisher;
    private final RunningSubmissionConfig runningSubmissionConfig;
    private final AtomicBoolean stopJudge = new AtomicBoolean(false);
    private final String CONTEST_SERVICE_TO_CREATE = "ContestService";
    private final String PRACTICE_PROBLEM_SERVICE_TO_CREATE = "PracticeProblemService";
    private final List<String> serviceToCreates = Arrays.asList(CONTEST_SERVICE_TO_CREATE, PRACTICE_PROBLEM_SERVICE_TO_CREATE);

    public JudgeRunningSubmissionService(RunningSubmissionRepository runningSubmissionRepository,
                                         TestCaseRepository testCaseRepository,
                                         VirtualMachine virtualMachine,
                                         ProblemRepository problemRepository,
                                         SubmissionRepository submissionRepository,
                                         SubmissionEventPublisher submissionEventPublisher,
                                         RunningSubmissionConfig runningSubmissionConfig) {
        this.runningSubmissionRepository = runningSubmissionRepository;
        this.testCaseRepository = testCaseRepository;
        this.virtualMachine = virtualMachine;
        this.problemRepository = problemRepository;
        this.submissionRepository = submissionRepository;
        this.submissionEventPublisher = submissionEventPublisher;
        this.runningSubmissionConfig = runningSubmissionConfig;
        executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(runningSubmissionConfig.getMaxJudgingThread());
        new Scheduler(runningSubmissionConfig.getScanRateMillis(), new Scheduler.Runner() {
            @Override
            protected void run() throws Throwable {
                process();
            }
        }).start();
    }

    private synchronized void process() {
        if (stopJudge.get())
            return;
        if (allThreadsAreActive())
            return;
        final RunningSubmission runningSubmission  = runningSubmissionRepository.getOne();
        if (runningSubmission != null) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        judge(runningSubmission);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void judge(RunningSubmission runningSubmission) throws IOException, InterruptedException {
        final List<TestCase> testCases = testCaseRepository.getTestCasesByProblemId(runningSubmission.getProblemId());
        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            VirtualMachine.RunResult result = virtualMachine.run(runningSubmission.getCode(), testCase.getInput(), runningSubmission.getProgrammingLanguage());
            OutputComparator.CompareResult compareResult = OutputComparator.compare(testCase.getExpectedOutput(), result.output());
            Submission submission = null;
            if (!compareResult.equal) {
                submission = Submission.fromRunningSubmission(runningSubmission, false);
            } else {
                submission = Submission.fromRunningSubmission(runningSubmission, true);
            }
            if (i == testCases.size() - 1) {
                runningSubmissionRepository.delete(runningSubmission.getId());
                submissionRepository.save(submission);
            }
        }
    }

    private boolean allThreadsAreActive() {
        return executor.getActiveCount() == runningSubmissionConfig.getMaxJudgingThread();
    }
}
