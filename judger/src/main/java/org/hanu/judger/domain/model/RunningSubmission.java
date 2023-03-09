package org.hanu.judger.domain.model;

import org.bson.types.ObjectId;

import java.util.Date;

public class RunningSubmission {
    private ObjectId id;
    private ObjectId coderId;
    private ObjectId problemId;
    private String code;
    private ProgrammingLanguage programmingLanguage;
    private Date submittedAt;

    public RunningSubmission(ObjectId id, ObjectId coderId, ObjectId problemId, String code, ProgrammingLanguage programmingLanguage, Date submittedAt) {
        this.id = id;
        this.coderId = coderId;
        this.problemId = problemId;
        this.code = code;
        this.programmingLanguage = programmingLanguage;
        this.submittedAt = submittedAt;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getCoderId() {
        return coderId;
    }

    public void setCoderId(ObjectId coderId) {
        this.coderId = coderId;
    }

    public ObjectId getProblemId() {
        return problemId;
    }

    public void setProblemId(ObjectId problemId) {
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
