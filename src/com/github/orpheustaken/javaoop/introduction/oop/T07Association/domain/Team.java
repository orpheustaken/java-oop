package com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain;

public class Team {
    private String name;

    // Many to one in relation to Player:
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public void print() {
        System.out.println(this.name);

        if (players == null) {
            System.out.println("Team has no players.");
            return;
        }

        for (Player player : players) {
            System.out.println("    " + player.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
