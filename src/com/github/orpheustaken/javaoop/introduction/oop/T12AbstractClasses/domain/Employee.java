package com.github.orpheustaken.javaoop.introduction.oop.T12AbstractClasses.domain;

// Abstract Classes are to be extended only. They can never be instanciated.
// All rules defined in the Abstract Class will still be applied to its children.
public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonusSalary();
    }

    // Abstract Methods are there as a prototype to be Overriden.
    // That means that each new Inherited Class must have its own implementation of the Method.
    public abstract void calculateBonusSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
