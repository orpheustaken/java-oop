package com.github.orpheustaken.javaoop.introduction.oop.T03MethodOverloading.domain;

public class Film {
    private String name;
    private String genre;
    private double imdbScore;
    private boolean isWatched;

    // Initialize entire class into an object in one call.
    public void init(String name, String genre, double imdbScore) {
//        this.name = name;
//        this.genre = genre;
//        this.imdbScore = imdbScore;
        setName(name);
        setGenre(genre);
        setImdbScore(imdbScore);
    }

    // Method Overloading.
    // Same name for method but param types or amounts are different.
    public void init(String name, String genre, double imdbScore, boolean isWatched) {
        this.init(name, genre, imdbScore);
        setWatched(isWatched);
    }

    public void printInfo() {
        System.out.println(getName());
        System.out.println(getGenre());
        System.out.println(getImdbScore());
        System.out.println(isWatched());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbScore() {
        return this.imdbScore;
    }

    public void setImdbScore(double imdbScore) {
        this.imdbScore = imdbScore;
    }

    public boolean isWatched() {
        return isWatched;
    }

    public void setWatched(boolean watched) {
        isWatched = watched;
    }
}
