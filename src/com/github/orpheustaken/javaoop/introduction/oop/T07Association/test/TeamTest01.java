package com.github.orpheustaken.javaoop.introduction.oop.T07Association.test;

import com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain.Player;
import com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain.Team;

public class TeamTest01 {
    public static void main(String[] args) {

        // Bidirectional association, one to many:
        Player player = new Player("Messi");
        Player player2 = new Player("Di María");
        Team team = new Team("Asociación del Fútbol Argentino");

        // Associate Players to Team:
        Player[] players = {player, player2};
        team.setPlayers(players);

        // Relationship integrity.
        // Associate Team to each Player:
        player.setTeam(team);
        player2.setTeam(team);

        System.out.println("        Players:");
        player.print();
        player2.print();
        System.out.println();

        System.out.println("        Teams:");
        team.print();
        System.out.println();
    }
}
