package org.hanu.judger.domain.model;

public class Submission {
    private long id;
    private long problemId;
    private ProgrammingLanguage programmingLanguage;
    private String code;
    private long coderId;
    private boolean status;

    public Submission(long id, long problemId, ProgrammingLanguage programmingLanguage, String code, long coderId, boolean status) {
        this.id = id;
        this.problemId = problemId;
        this.programmingLanguage = programmingLanguage;
        this.code = code;
        this.coderId = coderId;
        this.status = status;
    }

    public static Submission fromRunningSubmission(RunningSubmission runningSubmission, boolean status){
        return new Submission(runningSubmission.getId(),runningSubmission.getProblemId(),runningSubmission.getProgrammingLanguage(),runningSubmission.getCode(),runningSubmission.getCoderId(),status);
    }
    public long getProblemId() {
        return problemId;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getCode() {
        return code;
    }

    public long getCoderId() {
        return coderId;
    }

    public boolean isStatus() {
        return status;
    }

}
