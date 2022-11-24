package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            return;
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}
