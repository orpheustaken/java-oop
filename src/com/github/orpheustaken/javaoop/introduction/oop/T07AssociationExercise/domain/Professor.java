package com.github.orpheustaken.javaoop.introduction.oop.T07AssociationExercise.domain;

public class Professor {
    private String name;
    private String researchField;
    private Presentation[] presentations;

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Presentation[] presentations) {
        this.name = name;
        this.researchField = researchField;
        this.presentations = presentations;
    }

    public void print() {
        System.out.println("Professor: " + this.name);
        System.out.println("Research Field: " + this.researchField);

        if (presentations == null) {
            System.out.println(this.name + " is incompetent and doesn't have a presentation.");
            return;
        }

        System.out.println("Presentations:");
        for (Presentation presentation : presentations) {
            System.out.println("    " + presentation.getTitle());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Presentation[] getPresentations() {
        return presentations;
    }

    public void setPresentations(Presentation[] presentations) {
        this.presentations = presentations;
    }
}
