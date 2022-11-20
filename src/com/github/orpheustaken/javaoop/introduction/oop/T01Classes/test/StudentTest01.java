package com.github.orpheustaken.javaoop.introduction.oop.T01Classes.test;

import com.github.orpheustaken.javaoop.introduction.oop.T01Classes.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.age = 21;
        student.name = "John";
        student.gender = 'M';

        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.gender);
    }
}
