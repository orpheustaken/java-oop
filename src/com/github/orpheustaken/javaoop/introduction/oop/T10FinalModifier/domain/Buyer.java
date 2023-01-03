package com.github.orpheustaken.javaoop.introduction.oop.T10FinalModifier.domain;

public class Buyer {
    private String name;

    @Override
    public String toString() {
        return "Buyer{" +
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
