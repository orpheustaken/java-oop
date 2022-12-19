package com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain;

public class Player {
    private String name;

    // Association between objects.
    // Works similarly to tables relationship in a database.
    // As in one to one, one to many and many to many.

    // They can also be unidirectional and bidirectional.
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public void print() {
        System.out.println(this.name);
        if (this.team != null) {
            System.out.println("    " + this.team.getName());
        }
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
