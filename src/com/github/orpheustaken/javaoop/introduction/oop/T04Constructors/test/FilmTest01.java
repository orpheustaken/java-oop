package com.github.orpheustaken.javaoop.introduction.oop.T04Constructors.test;

import com.github.orpheustaken.javaoop.introduction.oop.T04Constructors.domain.Film;

public class FilmTest01 {
    public static void main(String[] args) {
        Film film = new Film("Godfather", "Crime", 9.2, true);
        Film film1 = new Film();
        Film film2 = new Film("Medianeras", "Documentary", 7.5, true, "Taretto");

        film.printInfo();
        film1.printInfo();
        film2.printInfo();
    }
}
