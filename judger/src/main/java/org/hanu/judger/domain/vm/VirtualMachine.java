package org.hanu.judger.domain.vm;

import org.hanu.judger.domain.model.KB;
import org.hanu.judger.domain.model.Millisecond;
import org.hanu.judger.domain.model.ProgrammingLanguage;

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
