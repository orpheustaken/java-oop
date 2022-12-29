package com.github.orpheustaken.javaoop.introduction.oop.T08Inheritance.domain;

// Everything done in the Superclass will impact its Subclasses.
public class Employee {
    // Protected Modifier:

    // Subclasses and Classes from the same package can access attributes from Superclass
    // as if they were public.
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print("\n");
        System.out.println("Employee:");
        System.out.println("    Name: " + this.name);
        System.out.println("    Social Security Number: " + this.socialSecurityNumber);
        System.out.println("    Salary: " + this.salary);
        System.out.println("    Address:");
        System.out.println("        " + this.address.getStreet());
        System.out.println("        " + this.address.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
