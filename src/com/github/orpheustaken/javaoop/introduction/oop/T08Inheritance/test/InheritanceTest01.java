package com.github.orpheustaken.javaoop.introduction.oop.T08Inheritance.test;

import com.github.orpheustaken.javaoop.introduction.oop.T08Inheritance.domain.Address;
import com.github.orpheustaken.javaoop.introduction.oop.T08Inheritance.domain.Employee;
import com.github.orpheustaken.javaoop.introduction.oop.T08Inheritance.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();

        address.setStreet("12th Avenue");
        address.setZipCode("12345");

        Employee employee = new Employee("Mike Ehrmantraut");

        employee.setSocialSecurityNumber("54321");
        employee.setSalary(100000);
        employee.setAddress(address);

        employee.print();

        Manager manager = new Manager("Gus Fring");

        manager.setSocialSecurityNumber("98765");
        manager.setSalary(1000000);
        manager.setAddress(address);
        manager.setDepartment("Chickens");

        manager.print();
        manager.paymentReport();
    }
}
