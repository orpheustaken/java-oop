package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.test;

import com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain.Student;
import com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        StudentPrinter studentPrinter = new StudentPrinter();

        student01.name = "John";
        student01.age = 20;
        student01.gender = 'M';

        student02.name = "Jane";
        student02.age = 25;
        student02.gender = 'F';

        studentPrinter.print(student01);
        studentPrinter.print(student02);
    }
}
