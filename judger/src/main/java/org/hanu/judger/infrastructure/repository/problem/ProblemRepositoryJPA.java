package org.hanu.judger.infrastructure.repository.problem;

import org.hanu.judger.infrastructure.model.ProblemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemRepositoryJPA extends JpaRepository<ProblemEntity, Long> {
}
