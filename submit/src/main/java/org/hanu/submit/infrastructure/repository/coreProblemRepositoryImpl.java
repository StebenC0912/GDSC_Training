package org.hanu.submit.infrastructure.repository;

import org.hanu.submit.domain.coreProblem.model.runningProblemCore;
import org.hanu.submit.domain.coreProblem.repository.coreProblemRepository;
import org.hanu.submit.infrastructure.model.runningProblem;

public class coreProblemRepositoryImpl implements coreProblemRepository {
    private submitJpaRepo submitJpaRepo;

    @Override
    public runningProblemCore createCoreProblem(runningProblemCore coreProblem) {
        runningProblem submit = new runningProblem(coreProblem.getId(), coreProblem.getCoderId(), coreProblem.getCode(), coreProblem.getProgrammingLanguage(), coreProblem.getProblemId());
        return submitJpaRepo.save(submit).toCore();
    }
}
