package com.github.orpheustaken.javaoop.introduction.oop.T08Inheritance.domain;

public class Manager extends Employee {
    private String department;

    // The Superclass Employee requires the name in the Constructor.
    // Because of that, Manager also needs to pass the name to the Superclass in its Constructor.
    public Manager(String name) {
        super(name);
    }

    // Overriding: Same signature as in the Superclass in the Subclass.
    // Same access modifier, return type and name.

    // @Override annotation is just for readability and compile warnings:
    @Override
    public void print() {
        // super will call the method from the Superclass:
        super.print();
        System.out.println("    Manager at department: " + this.department);
    }

    public void paymentReport() {
        System.out.print("\n");

        // Superclass attributes are protected, so they can be accessed with "this".
        System.out.println(this.name + " received the payment of " + this.salary +
                " chicken wings.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
