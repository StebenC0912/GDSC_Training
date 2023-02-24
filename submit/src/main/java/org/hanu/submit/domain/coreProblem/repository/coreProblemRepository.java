package org.hanu.submit.domain.coreProblem.repository;

import org.hanu.submit.domain.coreProblem.model.runningProblem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface coreProblemRepository extends JpaRepository<runningProblem, Long> {
}
