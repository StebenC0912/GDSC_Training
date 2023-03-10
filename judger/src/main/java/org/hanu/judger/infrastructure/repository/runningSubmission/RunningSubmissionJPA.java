package org.hanu.judger.infrastructure.repository.runningSubmission;

import org.hanu.judger.infrastructure.model.RunningSubmissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RunningSubmissionJPA extends JpaRepository<RunningSubmissionEntity, Long> {
    @Query(value = "SELECT * FROM running_submission ORDER BY submitted_at DESC LIMIT 1", nativeQuery = true)
    RunningSubmissionEntity get();
}
