package org.hanu.submit.domain.coder.service;

import org.hanu.submit.domain.coder.model.Coder;
import org.hanu.submit.domain.coder.repository.CoderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoderServiceImpl implements CoderService {
    @Autowired
    private CoderRepository coderRepository;

    @Override
    public void create(String name, int age) {
        Coder coder = Coder.create(name, age);
        coderRepository.save(coder);
    }

    @Override
    public Coder getCoderById(String id) {
        return coderRepository.getCoderById(Long.parseLong(id));
    }
}
