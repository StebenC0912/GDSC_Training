package org.hanu.submit.infrastructure.repository.coder;

import org.hanu.submit.domain.coder.model.Coder;
import org.hanu.submit.domain.coder.repository.CoderRepository;
import org.hanu.submit.infrastructure.model.CoderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CoderRepositoryImpl implements CoderRepository {
    @Autowired
    private CoderJpaRepository coderJpaRepository;

    @Override
    public List<Coder> getAllCoders() {
        List<CoderEntity> codersEntities = coderJpaRepository.findAll();
        List<Coder> coders = new ArrayList<>();
        for (CoderEntity coderEntity : codersEntities) {
            coders.add(coderEntity.toDomain());
        }
        return coders;
    }

    @Override
    public Coder getCoderById(Long id) {
        return coderJpaRepository.findById(id.toString()).get().toDomain();
    }

    @Override
    public void save(Coder coder) {
        coderJpaRepository.save(CoderEntity.fromDomain(coder));
    }
}
