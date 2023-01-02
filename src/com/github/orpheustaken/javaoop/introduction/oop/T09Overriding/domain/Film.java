package com.github.orpheustaken.javaoop.introduction.oop.T09Overriding.domain;

public class Film {
    private String name;

    public Film(String name) {
        this.name = name;
    }

    // Will override the default behaviour of returning the memory address.
//    @Override
//    public String toString() {
//        return "Not all who wander are lost.";
//    }

    // Inserted by IntelliJ:
    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
