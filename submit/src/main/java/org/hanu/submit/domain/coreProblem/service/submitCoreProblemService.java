package org.hanu.submit.domain.coreProblem.service;

import org.springframework.stereotype.Service;

@Service
public interface submitCoreProblemService {
    void submitCore(Long id, Long coderId, String code, String language, Long problemId);
}
