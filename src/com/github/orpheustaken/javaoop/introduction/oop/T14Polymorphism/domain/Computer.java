package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.21;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating Taxes...");
        return this.price * TAX_PERCENTAGE;
    }
}
