package com.github.orpheustaken.javaoop.introduction.oop.T07Association.test;

import com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain.Player;
import com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Team team1 = new Team("Asociación del Fútbol Argentino");

        player1.setTeam(team1);

        player1.print();
    }
}
