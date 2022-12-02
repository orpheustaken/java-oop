package com.github.orpheustaken.javaoop.introduction.oop.T06StaticModifier.test;

import com.github.orpheustaken.javaoop.introduction.oop.T06StaticModifier.domain.Car;

public class TestCar01 {
    public static void main(String[] args) {
        // STATIC values DON'T need an Object to be called, since they belong to the CLASS.
        System.out.println(Car.speedLimit);

        Car car0 = new Car("BMW", 270);
        Car car1 = new Car("Mercedes", 280);
        Car car2 = new Car("Audi", 290);

        // When Speed Limit is not STATIC, each Object has its own speedLimit.
        // So this changes only car0 attribute.
        // When STATIC, this changes the value of speedLimit to all Objects.

//        car0.setSpeedLimit(1000);

        // STATIC values are usually public?
        // This is the appropriate way of changing them, by calling the CLASS.
        Car.speedLimit = 120;

        car0.print();
        car1.print();
        car2.print();
    }
}
