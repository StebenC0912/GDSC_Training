package org.hanu.judger.domain.vm;

import org.hanu.judger.domain.model.KB;
import org.hanu.judger.domain.model.Millisecond;
import org.hanu.judger.domain.model.ProgrammingLanguage;

import java.io.IOException;

public interface VirtualMachine {
    interface RunResult {
        boolean compilationError();
        String compilationMessage();
        boolean stdError();
        String stdMessage();
        KB memory();
        Millisecond runTime();
        String output();
    }

    RunResult run(String code, String input, ProgrammingLanguage programmingLanguage) throws IOException, InterruptedException;

}
