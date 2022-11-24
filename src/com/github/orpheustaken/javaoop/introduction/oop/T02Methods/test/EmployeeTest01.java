package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.test;

import com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("John");
        employee.setAge(30);
        // Arrays are a reference type, an object, that's why you use new.
        employee.setSalaries(new double[]{100000.01, 200000.12, 300000.23});

        employee.printInfo();
    }
}
