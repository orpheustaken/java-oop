package com.github.orpheustaken.javaoop.introduction.oop.T12AbstractClasses.test;

import com.github.orpheustaken.javaoop.introduction.oop.T12AbstractClasses.domain.Developer;
import com.github.orpheustaken.javaoop.introduction.oop.T12AbstractClasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Jane Doe", 150000);
        Developer developer = new Developer("Bobby Tables", 20000);

        System.out.println(manager);
        System.out.println(developer);
    }
}
