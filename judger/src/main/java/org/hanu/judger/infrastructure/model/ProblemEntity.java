package org.hanu.judger.infrastructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hanu.judger.domain.model.Problem;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProblemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String description;
    private String allowedLanguages;
    public Problem toDomain() {
        return new Problem(id, name, description, allowedLanguages);
    }
}
