package com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain;

public class Player {
    private String name;

    public void print() {
        System.out.println(this.name);
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
