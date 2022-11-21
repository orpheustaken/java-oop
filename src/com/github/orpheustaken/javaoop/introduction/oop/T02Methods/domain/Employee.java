package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

        System.out.print("\n");

        for (double salary : salaries) {
            System.out.println(salary);
        }

        salaryAverage();
    }

    public void salaryAverage() {
        double total = 0;

        for (double salary : this.salaries) {
            total += salary;
        }

        double average = total / this.salaries.length;

        System.out.println("Salary average is " + average);
    }
}
