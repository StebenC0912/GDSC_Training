package org.hanu.submit.domain.coder.repository;

import org.hanu.submit.domain.coder.model.Coder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface coderRepository {
    List<Coder> getAllCoders();

    Coder getCoderById(Long id);
}
