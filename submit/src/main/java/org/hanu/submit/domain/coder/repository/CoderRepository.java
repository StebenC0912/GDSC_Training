package org.hanu.submit.domain.coder.repository;

import org.hanu.submit.domain.coder.model.Coder;

import java.util.List;

public interface CoderRepository {
    List<Coder> getAllCoders();

    Coder getCoderById(Long id);

    void save(Coder coder);
}
