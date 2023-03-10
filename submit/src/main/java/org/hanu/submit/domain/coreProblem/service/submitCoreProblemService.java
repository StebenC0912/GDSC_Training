package org.hanu.submit.domain.coreProblem.service;

public interface submitCoreProblemService {
    void submitCore(Long id, Long coderId, String code, String language, Long problemId);
}
