package com.lavendor.printfarm.printer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PrinterStatus {

    IDLE("Idle"),
    BUSY("Busy"),
    MAINTENANCE("Under Maintenance"),
    ERROR("Error");

    private final String status;
}
