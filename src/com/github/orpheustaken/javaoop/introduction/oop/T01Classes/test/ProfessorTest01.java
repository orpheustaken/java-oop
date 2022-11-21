package com.github.orpheustaken.javaoop.introduction.oop.T01Classes.test;

import com.github.orpheustaken.javaoop.introduction.oop.T01Classes.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Dumbledore";
        professor.age = 120;
        professor.gender = 'M';

        System.out.println(professor.name);
        System.out.println(professor.age);
        System.out.println(professor.gender);
    }
}
