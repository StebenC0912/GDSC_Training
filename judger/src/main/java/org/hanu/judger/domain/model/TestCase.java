package org.hanu.judger.domain.model;

import org.bson.types.ObjectId;

import java.util.List;

public class TestCase {
    private final long problemId;
    private final String input;
    private final String expectedOutput;

    public TestCase(long problemId, String input, String expectedOutput) {
        this.problemId = problemId;
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    public long getProblemId() {
        return problemId;
    }
    public String getInput() {
        return input;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }
}
