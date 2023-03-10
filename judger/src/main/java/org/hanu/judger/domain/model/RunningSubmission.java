package org.hanu.judger.domain.model;

import org.bson.types.ObjectId;

import java.util.Date;

public class RunningSubmission {
    private long id;
    private long coderId;
    private long problemId;
    private String code;
    private ProgrammingLanguage programmingLanguage;
    private Date submittedAt;

    public RunningSubmission(long id, long coderId, long problemId, String code, ProgrammingLanguage programmingLanguage, Date submittedAt) {
        this.id = id;
        this.coderId = coderId;
        this.problemId = problemId;
        this.code = code;
        this.programmingLanguage = programmingLanguage;
        this.submittedAt = submittedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCoderId() {
        return coderId;
    }

    public void setCoderId(long coderId) {
        this.coderId = coderId;
    }

    public long getProblemId() {
        return problemId;
    }

    public void setProblemId(long problemId) {
        this.problemId = problemId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Date getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(Date submittedAt) {
        this.submittedAt = submittedAt;
    }
}
