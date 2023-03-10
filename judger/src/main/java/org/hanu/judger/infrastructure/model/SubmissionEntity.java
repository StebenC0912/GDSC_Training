package org.hanu.judger.infrastructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hanu.judger.domain.model.Submission;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long problemId;
    private String programmingLanguage;
    private String code;
    private Long coderId;
    private boolean status;


    public static SubmissionEntity toEntity(Submission submission) {
        return new SubmissionEntity(submission.getId(), submission.getProblemId(), submission.getProgrammingLanguage().toString(), submission.getCode(), submission.getCoderId(), submission.isStatus());
    }

}
