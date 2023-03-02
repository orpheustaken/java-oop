package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.service;

import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Computer;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Tomato;

// Service classes are responsible to apply business rules.
public class ProductTaxReportService {
    // All methods that are not accessing Instance Variables can be STATIC.
    // This way they can be called from the Class and not require an Object.
    public static void generateComputerTaxReport(Computer computer) {
        System.out.println("Starting the report for Computer...");
        double taxValue = computer.calculateTaxValue();
        System.out.println("Computer " + computer.getName());
        System.out.println("Price " + computer.getPrice());
        System.out.println("Tax Value " + taxValue);
    }

    public static void generateTomatoTaxReport(Tomato tomato) {
        System.out.println("Starting the report for Tomato...");
        double taxValue = tomato.calculateTaxValue();
        System.out.println("Tomato " + tomato.getName());
        System.out.println("Price " + tomato.getPrice());
        System.out.println("Tax Value " + taxValue);
    }
}
