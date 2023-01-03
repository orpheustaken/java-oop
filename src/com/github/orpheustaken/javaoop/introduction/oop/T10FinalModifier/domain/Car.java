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

    // Any Car object will reference its own BUYER object.
    // BUYER object will automatically be created when Car is created.
    // Given that BUYER is final, a constant, the relationship will never change.
    // The attributes inside BUYER can change, but never its reference (Memory Address) to Car.

    // You can never assign a new BUYER to the Car once it is created.
    public final Buyer BUYER = new Buyer();

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
