package org.hanu.judger.infrastructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hanu.judger.domain.model.RunningSubmission;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RunningSubmissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;
    private long coderId;
    private long problemId;
    private String code;
    private String programmingLanguage;
    private Date startTime;

    public RunningSubmission toDomain() {
        return new RunningSubmission(id, coderId, problemId, code, programmingLanguage, startTime);
    }
}
