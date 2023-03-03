package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain;

public class Cellphone extends Product {
    public static final double TAX_PERCENTAGE = 0.30;

    public Cellphone(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxValue() {
        return this.price * TAX_PERCENTAGE;
    }
}
