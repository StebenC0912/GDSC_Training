package org.hanu.judger.domain.vm;

import java.io.IOException;

public interface VirtualMachine {
    public static interface RunResult {
        public boolean compilationError();
        public String compilationMessage();
        public boolean stdError();
        public String stdMessage();
        public KB memory();
        public Millisecond runTime();
        public String output();
    }

    public RunResult run(String code, String input, ProgrammingLanguage programmingLanguage) throws IOException, InterruptedException;

}
