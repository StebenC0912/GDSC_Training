package org.hanu.judger.domain.repository;

import org.hanu.judger.domain.model.Problem;

public interface ProblemRepository {
    public Problem getProblemById(Long id);
}
