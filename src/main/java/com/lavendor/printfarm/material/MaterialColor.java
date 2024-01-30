package com.lavendor.printfarm.material;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MaterialColor {

    RED("Red"),
    GREEN("Green"),
    BLUE("Blue"),
    YELLOW("Yellow"),
    BLACK("Black"),
    WHITE("White"),
    ORANGE("Orange"),
    PURPLE("Purple"),
    GRAY("Gray");

    private final String displayValue;
}
