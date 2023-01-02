package com.github.orpheustaken.javaoop.introduction.oop.T10FinalModifier.test;

import com.github.orpheustaken.javaoop.introduction.oop.T10FinalModifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        // Static attribute should always be called by the Class:
        System.out.println(Car.SPEED_LIMIT);
    }
}
