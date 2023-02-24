package org.hanu.submit.infrastructure;

import org.hanu.submit.domain.model.Submit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
public class submitController {
    private
    @PostMapping("/")
    public ResponseEntity<?> submitCode(@RequestBody Submit submit) {

        return new ResponseEntity<>();
    }
}
