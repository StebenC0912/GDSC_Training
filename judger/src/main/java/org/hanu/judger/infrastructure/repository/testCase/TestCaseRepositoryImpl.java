package org.hanu.judger.infrastructure.repository.testCase;

import org.hanu.judger.domain.model.TestCase;
import org.hanu.judger.domain.repository.TestCaseRepository;
import org.hanu.judger.infrastructure.model.TestCaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class TestCaseRepositoryImpl implements TestCaseRepository {
    @Autowired
    private TestCaseJPA testCaseJPARepository;
    @Override
    public List<TestCase> getTestCasesByProblemId(long problemId) {
        List<TestCaseEntity> testCaseEntities = testCaseJPARepository.findByProblemId(problemId);
        return testCaseEntities.stream().map(testCaseEntity -> TestCaseEntity.toDomain(testCaseEntity)).collect(Collectors.toList());

    }
}
