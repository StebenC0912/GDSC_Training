package org.hanu.submit.infrastructure.repository;

import org.hanu.submit.infrastructure.model.runningProblem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface submitJpaRepo extends JpaRepository<runningProblem, Long> {
}
