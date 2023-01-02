package com.github.orpheustaken.javaoop.introduction.oop.T10FinalModifier.domain;

public class Car {
    private String brandName;

    // Constant variables don't have default initialization values.
    // Following best practices, constants must be all upper case and separated by underscores.
    // They can be public since there's no way no change them.

    // Constant variable of primitive type:
//    public static final double SPEED_LIMIT = 250;
    public static final double SPEED_LIMIT;

    // They may not always be STATIC.
    // So the value can be assigned in the constructor for the Object.
    // In this case we are assigning the value in the Init Block:
    static {
        SPEED_LIMIT = 250;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
