package com.lavendor.printfarm.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {

    PENDING("Pending"),
    PROCESSING("Processing"),
    IN_PRODUCTION("In Production"),
    COMPLETED("Completed"),
    CANCELED("Canceled");

    private final String status;
}
