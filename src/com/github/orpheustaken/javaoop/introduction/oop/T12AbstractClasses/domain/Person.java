package com.github.orpheustaken.javaoop.introduction.oop.T12AbstractClasses.domain;

// Employee as an abstract class will not need an implementation of the print method.
// But all Concrete Classes from Employee will.

// If a Concrete Method print is created in Employee, then the method will no longer
// be required in the Employee Subclasses, as they will be inherited.
public abstract class Person {
    public abstract void print();
}
