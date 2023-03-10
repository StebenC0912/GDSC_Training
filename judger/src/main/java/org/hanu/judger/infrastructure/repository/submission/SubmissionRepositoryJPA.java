package org.hanu.judger.infrastructure.repository.submission;

import org.hanu.judger.infrastructure.model.SubmissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionRepositoryJPA extends JpaRepository<SubmissionEntity, Long> {
}
