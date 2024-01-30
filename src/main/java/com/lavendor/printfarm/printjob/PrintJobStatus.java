package com.lavendor.printfarm.printjob;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PrintJobStatus {

    QUEUED("Queued"),
    SCHEDULED("Scheduled"),
    PRINTING("Printing"),
    PAUSED("Paused"),
    COMPLETED("Completed"),
    FAILED("Failed"),
    CANCELED("Canceled");

    private final String status;
}