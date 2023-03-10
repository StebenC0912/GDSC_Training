package org.hanu.judger.infrastructure.repository.runningSubmission;

import org.hanu.judger.domain.model.RunningSubmission;
import org.hanu.judger.domain.repository.RunningSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RunningSubmissionRepositoryImpl implements RunningSubmissionRepository {
    @Autowired
    private RunningSubmissionJPA runningSubmissionJPA;
    @Override
    public RunningSubmission getOne() {
        return runningSubmissionJPA.get().toDomain();
    }

    @Override
    public void delete(long id) {
        runningSubmissionJPA.deleteById(id);
    }
}
