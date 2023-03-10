package org.hanu.submit.infrastructure.repository.coder;

import org.hanu.submit.infrastructure.model.CoderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoderJpaRepository extends JpaRepository<CoderEntity, String> {

}
