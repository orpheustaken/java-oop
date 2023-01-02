package com.github.orpheustaken.javaoop.introduction.oop.T09Overriding.test;

import com.github.orpheustaken.javaoop.introduction.oop.T09Overriding.domain.Film;

public class FilmTest01 {
    public static void main(String[] args) {
        Film film = new Film("Hereditary");

        // When printing an object, it will automatically print its memory address.
        // For that it implicitly calls the toString() method.

        // In this case it will print the overrided toString() method.
//        System.out.println(film);
        System.out.println(film.toString());
    }
}
