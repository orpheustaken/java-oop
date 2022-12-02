package com.github.orpheustaken.javaoop.introduction.oop.T06StaticModifier.domain;

public class Car {
    private String brandName;
    private double maxSpeed;

    // When not using a STATIC modifier, each instance has its own attribute.
    // This means that each object uses its own memory space for that value.

    // STATIC modifier allows this value to be unique and belong to the CLASS.
    // There will be only one Speed Limit memory place allocated, and all Objects will point to it.
    public static double speedLimit = 250;

    public Car(String brandName, double maxSpeed) {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.print("\n");
        System.out.println("Brand: " + this.brandName);
        System.out.println("Maximum Speed: " + this.maxSpeed);

        // THIS access the value through the OBJECT.
        // STATIC values shall be accessed through the CLASS directly.
        System.out.println("Speed Limit: " + Car.speedLimit);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
