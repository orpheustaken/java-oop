package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.service;

//import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Computer;

import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Product;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Tomato;
//import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Tomato;

// Service classes are responsible to apply business rules.
public class ProductTaxReportService {
    // All methods that are not accessing Instance Variables can be STATIC.
    // This way they can be called from the Class and not require an Object.
//    public static void generateComputerTaxReport(Computer computer) {
//        System.out.println("Starting the report for Computer...");
//        double taxValue = computer.calculateTaxValue();
//        System.out.println("Computer " + computer.getName());
//        System.out.println("Price " + computer.getPrice());
//        System.out.println("Tax Value " + taxValue);
//    }
//
//    public static void generateTomatoTaxReport(Tomato tomato) {
//        System.out.println("Starting the report for Tomato...");
//        double taxValue = tomato.calculateTaxValue();
//        System.out.println("Tomato " + tomato.getName());
//        System.out.println("Price " + tomato.getPrice());
//        System.out.println("Tax Value " + taxValue);
//    }

    // Polymorphic Parameters.
    // Polymorphism reduces the amount of code.
    // Instead of creating a report for each Subclass, the Product Class is used.
    // And it executes the methods from the Subclasses using the Class as reference var.
    public static void generateTaxReport(Product product) {
        System.out.println("Starting the Tax Report...");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product " + product.getName());
        System.out.println("Price " + product.getPrice());
        System.out.println("Tax Value " + taxValue);

        // Narrowing Cast.
        // This makes Product aware of Tomato and its methods.
        // And also points to the same object product.

        // Always make sure the Narrowing Cast is happening in a safe mode.
        // For that instanceof is used.

        // Pattern Variable:
        if (product instanceof Tomato tomato) {
            System.out.println(tomato.getExpDate());
        }
        // Not Pattern Variable:
//        if (product instanceof Tomato) {
//            Tomato tomato = (Tomato) product;
//            System.out.println(tomato.getExpDate());
//        }
    }
}
