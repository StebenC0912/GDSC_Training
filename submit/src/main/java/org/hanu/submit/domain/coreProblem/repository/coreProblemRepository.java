package org.hanu.submit.domain.coreProblem.repository;

import org.hanu.submit.domain.coreProblem.model.runningProblemCore;
import org.springframework.stereotype.Repository;

@Repository
public interface coreProblemRepository {
    runningProblemCore createCoreProblem(runningProblemCore coreProblem);
}
