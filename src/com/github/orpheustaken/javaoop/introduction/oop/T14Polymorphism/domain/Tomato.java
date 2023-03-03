package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;
    private String expDate;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating Taxes...");
        return this.price * TAX_PERCENTAGE;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}
