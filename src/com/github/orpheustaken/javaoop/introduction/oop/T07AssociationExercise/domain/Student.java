package com.github.orpheustaken.javaoop.introduction.oop.T07AssociationExercise.domain;

public class Student {
    private String name;
    private int age;
    private Presentation presentation;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Presentation presentation) {
        this.name = name;
        this.age = age;
        this.presentation = presentation;
    }

    public void print() {
        System.out.println("Student: " + this.name);
        System.out.println("Age: " + this.age);

        if (presentation == null) {
            System.out.println(this.name + " is lazy and doesn't have a presentation.");
            return;
        }

        System.out.println("Presentation: " + presentation.getTitle());
    }

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

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }
}
