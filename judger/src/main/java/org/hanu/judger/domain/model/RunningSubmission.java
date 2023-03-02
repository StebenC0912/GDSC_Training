package org.hanu.judger.domain.model;

public class RunningSubmission {
    private String id;
    private String code;
    private String language;
    private String input;
    private String output;
    private String expectedOutput;
    private String status;
    private String error;

    public RunningSubmission() {
    }

    public RunningSubmission(String id, String code, String language, String input, String output, String expectedOutput, String status, String error) {
        this.id = id;
        this.code = code;
        this.language = language;
        this.input = input;
        this.output = output;
        this.expectedOutput = expectedOutput;
        this.status = status;
        this.error = error;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(String expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
