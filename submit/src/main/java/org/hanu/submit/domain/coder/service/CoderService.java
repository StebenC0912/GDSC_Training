package org.hanu.submit.domain.coder.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hanu.submit.domain.coder.model.Coder;

public interface CoderService {
    void create(String name, int age);

    Coder getCoderById(String id);

    @NoArgsConstructor
    @AllArgsConstructor
    class Input {
        public String name;
        public int age;
    }
}
