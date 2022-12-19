package com.github.orpheustaken.javaoop.introduction.oop.T07AssociationExercise.domain;

public class Presentation {
    private String title;
    private Student[] students;
    private Place place;

    public Presentation(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Presentation(String title, Student[] students, Place place) {
        this.title = title;
        this.students = students;
        this.place = place;
    }

    public void print() {
        System.out.println("Presentation: " + this.title);
        System.out.println("Address: " + place.getAddress());

        if (students == null) {
            System.out.println(this.title + " doesn't have students.");
            return;
        }

        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("    " + student.getName() + ", Age: " + student.getAge());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
