package org.hanu.submit.infrastructure.controller;


import org.hanu.submit.domain.practiceProblem.service.submitProblemService;
import org.hanu.submit.infrastructure.model.inputSubmit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class submitController {
    @Autowired
    private submitProblemService submitProblemService;
    @PostMapping("/practiceProblem/submit")
    public ResponseEntity<?> submitCode(@RequestBody inputSubmit inputSubmit) {
        Long id = submitProblemService.submit(inputSubmit.getId(), inputSubmit.getCoderId(), inputSubmit.getCode(), inputSubmit.getProgrammingLanguage(), inputSubmit.getProblemId());
        return new ResponseEntity<>(id, null, HttpStatus.OK);
    }
}
