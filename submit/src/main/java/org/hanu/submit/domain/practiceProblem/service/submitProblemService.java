package org.hanu.submit.domain.practiceProblem.service;

import org.hanu.submit.infrastructure.model.inputSubmit;
import org.springframework.stereotype.Service;

@Service
public interface submitProblemService {
    Long submit(inputSubmit inputSubmit);
}
