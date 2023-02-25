package org.hanu.submit.domain.practiceProblem.service;

import org.hanu.submit.domain.practiceProblem.repository.practiceProblemRepository;
import org.hanu.submit.infrastructure.model.inputSubmit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class submitProblemServiceImpl implements submitProblemService {
    @Autowired
    private practiceProblemRepository practiceProblemRepository;

    @Override
    public void submit(inputSubmit inputSubmit) {

    }
}
