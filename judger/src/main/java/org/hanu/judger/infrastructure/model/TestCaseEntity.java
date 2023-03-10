package org.hanu.judger.infrastructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.hanu.judger.domain.model.TestCase;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestCaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;

    private String problemId;
    @Column(columnDefinition = "LONGTEXT")
    private String input;
    @Column(columnDefinition = "LONGTEXT")
    private String expectedOutput;

    public static TestCase toDomain(TestCaseEntity testCaseEntity) {
        return new TestCase(Long.parseLong(testCaseEntity.getProblemId()), testCaseEntity.getInput(), testCaseEntity.getExpectedOutput());
    }
}
