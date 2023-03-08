package org.hanu.judger.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RunningSubmission {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private String coderId;
    private String problemId;
    private String code;
    private String programmingLanguage;
    private Date startTime;
}
