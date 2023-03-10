package org.hanu.submit.infrastructure.repository.coreProblem;

import org.hanu.submit.domain.coreProblem.model.runningProblemCore;
import org.hanu.submit.domain.coreProblem.repository.coreProblemRepository;
import org.hanu.submit.infrastructure.model.runningProblem;
import org.springframework.stereotype.Repository;

@Repository
public class coreProblemRepositoryImpl implements coreProblemRepository {
    private org.hanu.submit.infrastructure.repository.coreProblem.submitJpaRepo submitJpaRepo;

    @Override
    public runningProblemCore createCoreProblem(runningProblemCore coreProblem) {
        runningProblem submit = new runningProblem(coreProblem.getId(), coreProblem.getCoderId(), coreProblem.getCode(), coreProblem.getProgrammingLanguage(), coreProblem.getProblemId());
        return submitJpaRepo.save(submit).toCore();
    }
}
