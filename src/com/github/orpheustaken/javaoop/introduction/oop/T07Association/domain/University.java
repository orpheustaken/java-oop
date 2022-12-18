package com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain;

public class University {
    private String name;

    // Many to one relationship.
    // Professor can only work at one University, but an University will have many Professors.
    private Professor[] professors;

    // We may not have a Professor yet when creating an University.
    public University(String name) {
        this.name = name;
    }

    // Overloaded constructor for when we do have a Professor.
    public University(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public void print() {
        System.out.println(this.name);

        if (professors == null) {
            System.out.println("There is no Professor object associated with this University.");
            return;
        }

        System.out.println("    Professors:");
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
