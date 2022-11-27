package com.github.orpheustaken.javaoop.introduction.oop.T03MethodOverloading.test;

import com.github.orpheustaken.javaoop.introduction.oop.T03MethodOverloading.domain.Film;

public class FilmTest01 {
    public static void main(String[] args) {
        Film film = new Film();

        film.init("Godfather", "Crime", 9.2, true);

//        film.setName("Godfather");
//        film.setGenre("Crime");
//        film.setImdbScore(9.2);

        film.printInfo();
    }
}
