package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.test;

import com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "John";
        student01.age = 20;
        student01.gender = 'M';

        student02.name = "Jane";
        student02.age = 25;
        student02.gender = 'F';

        student01.print();
        student02.print();
    }
}
