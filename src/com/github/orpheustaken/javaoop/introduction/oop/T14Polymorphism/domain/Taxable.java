package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain;

public interface Taxable {
    // Taxes are only being implemented in Product Class.
    // Since Product is abstract, it does not require the method below.
    // But all Subclasses from Product will have to Override as the Interface says so.
    public abstract double calculateTaxValue();
}
