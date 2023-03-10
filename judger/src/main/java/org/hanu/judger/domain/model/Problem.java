package org.hanu.judger.domain.model;

public class Problem {
    private long id;
    private String name;
    private String description;
    private String allowedLanguages;

    public Problem(long id, String name, String description, String allowedLanguages) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.allowedLanguages = allowedLanguages;
    }

}
