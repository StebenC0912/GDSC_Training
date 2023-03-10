package org.hanu.judger.infrastructure.repository.submission;

import org.hanu.judger.domain.model.Submission;
import org.hanu.judger.domain.repository.SubmissionRepository;
import org.hanu.judger.infrastructure.model.SubmissionEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class SubmissionRepositoryImpl implements SubmissionRepository {
    @Autowired
    private SubmissionRepositoryJPA submissionRepositoryJPA;
    @Override
    public void save(Submission submission) {
        submissionRepositoryJPA.save(SubmissionEntity.toEntity(submission));
    }
}
