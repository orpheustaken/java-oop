package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating Taxes...");
        return this.price * TAX_PERCENTAGE;
    }
}
