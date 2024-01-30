package com.lavendor.printfarm.material;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MaterialType {

    PLA("PLA"),
    ABS("ABS"),
    PETG("PETG"),
    TPU("TPU"),
    NYLON("Nylon");

    private final String displayValue;
}
