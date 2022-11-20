package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
