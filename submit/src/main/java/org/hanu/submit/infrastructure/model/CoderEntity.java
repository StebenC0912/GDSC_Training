package org.hanu.submit.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.bson.types.ObjectId;
import org.hanu.submit.domain.coder.model.Coder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CoderEntity {
    @Id
    @Column(columnDefinition = "CHAR(36)")
    private String id;
    private String name;
    private int age;

    public static CoderEntity fromDomain(Coder coder) {
        return CoderEntity.builder()
                .id(coder.getId().toString())
                .name(coder.getName())
                .age(coder.getAge())
                .build();
    }

    public Coder toDomain() {
        return new Coder(new ObjectId(id), name, age);
    }

}
