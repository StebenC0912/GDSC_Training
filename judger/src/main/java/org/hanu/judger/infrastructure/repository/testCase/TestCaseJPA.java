package org.hanu.judger.infrastructure.repository.testCase;

import org.hanu.judger.infrastructure.model.TestCaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestCaseJPA extends JpaRepository<TestCaseEntity, Long> {
    List<TestCaseEntity> findByProblemId(long problemId);
}
