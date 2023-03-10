package org.hanu.judger.domain.repository;

import org.hanu.judger.domain.model.Submission;

public interface SubmissionRepository {
    void save(Submission submission);
}
