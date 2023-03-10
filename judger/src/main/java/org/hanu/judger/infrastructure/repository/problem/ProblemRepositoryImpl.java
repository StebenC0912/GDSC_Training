package org.hanu.judger.infrastructure.repository.problem;

import org.hanu.judger.domain.model.Problem;
import org.hanu.judger.domain.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProblemRepositoryImpl implements ProblemRepository {
    @Autowired
    private ProblemRepositoryJPA problemRepositoryJPA;
    @Override
    public Problem getProblemById(Long id) {
        return problemRepositoryJPA.getById(id).toDomain();
    }
}
