package org.hanu.submit.infrastructure.controller;


import org.hanu.submit.infrastructure.model.inputSubmit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class submitController {
    @Autowired

    @PostMapping("/practiceProblem/submit")
    public ResponseEntity<?> submitCode(@RequestBody inputSubmit inputSubmit) {

        return null;
    }
}
