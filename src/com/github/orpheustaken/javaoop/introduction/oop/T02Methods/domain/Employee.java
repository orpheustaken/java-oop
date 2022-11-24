package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
    }

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
