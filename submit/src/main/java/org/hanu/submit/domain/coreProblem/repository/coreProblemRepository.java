package org.hanu.submit.domain.coreProblem.repository;

import org.hanu.submit.domain.coreProblem.model.runningProblem;
import org.springframework.stereotype.Repository;

@Repository
public interface coreProblemRepository {
    runningProblem createCoreProblem(runningProblem coreProblem);
}
