package org.hanu.judger.domain.model;

public enum ProgrammingLanguage {
    JAVA,PYTHON,CPLUSPLUS,JAVASCRIPT;

    public static ProgrammingLanguage from(String language) {
        switch (language) {
            case "java":
                return JAVA;
            case "python":
                return PYTHON;
            case "c++":
                return CPLUSPLUS;
            case "javascript":
                return JAVASCRIPT;
            default:
            return null;
        }
    }
}
