package org.hanu.submit.domain.practiceProblem.service;


import org.hanu.submit.domain.coder.repository.coderRepository;
import org.hanu.submit.domain.coreProblem.service.submitCoreProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class submitProblemServiceImpl implements submitProblemService {

    @Autowired
    private coderRepository coderRepository;
    @Autowired
    private submitCoreProblemService submitCoreProblemService;

    @Override
    public Long submit(Long id, Long coderId, String code, String language, Long problemId) {
        if (coderRepository.getAllCoders().contains(coderId)) {
            throw new IllegalStateException("Coder with id " + coderId + " does not exist");
        }
        if (code.isEmpty() || code.trim().isEmpty()) {
            throw new IllegalStateException("Code cannot be empty");
        }
        submitCoreProblemService.submitCore(id, coderId, code, language, problemId);
        return id;

    }


}
