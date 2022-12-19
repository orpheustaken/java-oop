package com.github.orpheustaken.javaoop.introduction.oop.T07AssociationExercise.test;

import com.github.orpheustaken.javaoop.introduction.oop.T07AssociationExercise.domain.Place;
import com.github.orpheustaken.javaoop.introduction.oop.T07AssociationExercise.domain.Presentation;
import com.github.orpheustaken.javaoop.introduction.oop.T07AssociationExercise.domain.Professor;
import com.github.orpheustaken.javaoop.introduction.oop.T07AssociationExercise.domain.Student;

public class ExerciseTest01 {
    public static void main(String[] args) {
        // Instantiating Objects:
        Place place1 = new Place("First Floor");
        Place place2 = new Place("Second Floor");
        Place place3 = new Place("Third Floor");

        Presentation presentation1 = new Presentation("Hamlet", place1);
        Presentation presentation2 = new Presentation("Macbeth", place2);
        Presentation presentation3 = new Presentation("Romeo and Juliet", place3);

        Student student1 = new Student("John", 20);
        Student student2 = new Student("Jane", 21);
        Student student3 = new Student("Olivia", 21);
        Student student4 = new Student("Bobby Tables", 21);

        Professor professor1 = new Professor("Abraham", "Literature");
        Professor professor2 = new Professor("Elizabeth", "Literature");
        Professor professor3 = new Professor("Jack Black", "Who knows?");

        // Defining Relationships:
        student1.setPresentation(presentation1);
        student2.setPresentation(presentation1);
        student3.setPresentation(presentation2);

        Student[] studentsHamlet = {student1, student2};
        Student[] studentsMacbeth = {student3};
        presentation1.setStudents(studentsHamlet);
        presentation2.setStudents(studentsMacbeth);

        Presentation[] presentationsAbraham = {presentation1, presentation2};
        Presentation[] presentationsElizabeth = {presentation3};
        professor1.setPresentations(presentationsAbraham);
        professor2.setPresentations(presentationsElizabeth);

        // Instead of having a print method inside of each class,
        // you could have printed everything from Professor.

        // IDIOT.

        // Results Presentations:
        Presentation[] presentations = {presentation1, presentation2, presentation3};

        System.out.println();
        for (Presentation presentation : presentations) {
            presentation.print();
            System.out.println();
        }

        // Results Students:
        Student[] students = {student1, student2, student3, student4};

        System.out.println();
        for (Student student : students) {
            student.print();
            System.out.println();
        }

        // Results Professors:
        Professor[] professors = {professor1, professor2, professor3};

        System.out.println();
        for (Professor professor : professors) {
            professor.print();
            System.out.println();
        }
    }
}
