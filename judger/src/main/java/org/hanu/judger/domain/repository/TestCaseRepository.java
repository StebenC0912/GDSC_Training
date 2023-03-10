package org.hanu.judger.domain.repository;

import org.bson.types.ObjectId;
import org.hanu.judger.domain.model.TestCase;

import java.util.List;

public interface TestCaseRepository {
    List<TestCase> getTestCasesByProblemId(long problemId);
}
