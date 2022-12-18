package com.github.orpheustaken.javaoop.introduction.oop.T07Association.test;

import com.github.orpheustaken.javaoop.introduction.oop.T07Association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Player player2 = new Player("Di María");
        Player player3 = new Player("Emiliano Martínez");

//        Player[] players = new Player[]{player1, player2, player3};
        Player[] players = {player1, player2, player3};

        // Iterate over an array of objects and call the print method of each of them.
        for (Player player : players) {
            player.print();
        }
    }
}
