package com.github.orpheustaken.javaoop.introduction.oop.T13Interfaces.domain;

// Interfaces are similar to Abstract Classes.
// Objects cannot be created from Interfaces.
// They are a contract or prototype of how something is going to be implemented.

// One of the major differences between Abstract Classes and Interfaces
// is that a Class can implement multiple Interfaces.

public interface DataLoader {
    // All Attributes inside an Interface are public static final.
    public static final int MAX_DATA_SIZE = 10;

    // All methods written in a Interface are going to be public abstract.

    // Same rule as Abstract Methods in Classes,
    // the load() method has to be overriden where the interface is implemented.
    public abstract void load();

    // The default modifier was introduced after Java 8, and with this it is possible
    // to create Concrete Methods inside an Interface.

    // In this example, checkPermissions will be available to all Classes that implement DataLoader.
    public default void checkPermission() {
        System.out.println("Checking permissions...");
    }

    // Interfaces can also have static concrete methods.
    public static void retrieveMaxDataSize() {
        System.out.println("Max data size is " + MAX_DATA_SIZE);
    }

    // The purpose of a Interface is to be Implemented.
    // The purpose of a Abstract Class is to be Inherited.
}
