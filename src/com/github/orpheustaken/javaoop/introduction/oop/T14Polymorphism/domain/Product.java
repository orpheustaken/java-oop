package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain;

public abstract class Product implements Taxable {
    protected String name;
    protected double price;

    public Product(String name, double value) {
        this.name = name;
        this.price = value;
    }

    // The calculateTaxValue() could be here and would apply to all Subclasses.
    // But without overriding it in here, each Subclass will require its own method.

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
