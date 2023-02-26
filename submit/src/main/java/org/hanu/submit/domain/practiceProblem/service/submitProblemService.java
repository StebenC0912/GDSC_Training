package org.hanu.submit.domain.practiceProblem.service;

import org.springframework.stereotype.Service;

@Service
public interface submitProblemService {
    Long submit(Long id, Long coderId, String code, String language, Long problemId);
}
