package org.hanu.judger.domain.repository;

import org.hanu.judger.domain.model.RunningSubmission;

public interface RunningSubmissionRepository {
    RunningSubmission getOne();

    void delete(long id);
}
