package com.github.orpheustaken.javaoop.introduction.oop.T07Association.test;

import com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain.Professor;
import com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain.University;

public class UniversityTest01 {
    public static void main(String[] args) {
        // Usually when creating objects with associations,
        // it is better to start with those with fewer associations. Less dependencies to manage.

        Professor professor = new Professor("Dumbledore");
        Professor professor2 = new Professor("Minerva");

        // Array with one object.
        // Because the constructor below expects an array of Professors.
        Professor[] professors = {professor, professor2};

        // It is also possible to pass the array in the constructor argument.
        University university = new University("Hogwarts", professors);

        university.print();
    }
}
