package org.hanu.submit.domain.coreProblem.service;

import org.hanu.submit.domain.coreProblem.model.runningProblemCore;
import org.hanu.submit.domain.coreProblem.repository.coreProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class submitCoreProblemServiceImpl implements submitCoreProblemService {
    @Autowired
    private coreProblemRepository coreProblemRepository;

    @Override
    public void submitCore(Long id, Long coderId, String code, String language, Long problemId) {
        runningProblemCore coreProblem = new runningProblemCore(id, coderId, code, language, problemId);
        coreProblemRepository.createCoreProblem(coreProblem);
    }
}
