package org.hanu.judger.domain.config;

import java.util.List;

public interface RunningSubmissionConfig {
    int getMaxJudgingThread();

    int getScanRateMillis();

    int getScanLockSecond();

    List<String> getVirtualMachineUrls();

    String getVirtualMachineToken();

    String getVirtualMachineUser();

    boolean getVirtualMachineDeleteSubmission();
}
