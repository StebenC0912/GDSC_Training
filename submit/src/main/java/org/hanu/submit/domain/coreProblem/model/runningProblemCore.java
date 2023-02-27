package org.hanu.submit.domain.coreProblem.model;

public class runningProblemCore {
    private Long id;
    private Long coderId;
    private String code;
    private String programmingLanguage;
    private Long problemId;

    public runningProblemCore(Long id, Long coderId, String code, String programmingLanguage, Long problemId) {
        this.id = id;
        this.coderId = coderId;
        this.code = code;
        this.programmingLanguage = programmingLanguage;
        this.problemId = problemId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCoderId() {
        return coderId;
    }

    public void setCoderId(Long coderId) {
        this.coderId = coderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }
}
