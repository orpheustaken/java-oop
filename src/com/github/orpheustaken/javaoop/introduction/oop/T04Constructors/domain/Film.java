package com.github.orpheustaken.javaoop.introduction.oop.T04Constructors.domain;

public class Film {
    private String name;
    private String genre;
    private double imdbScore;
    private boolean isWatched;
    private String director;

    /*
    Constructor, constructs an Object from a Class.
    Doesn't have any modifiers or return types.
    Gets executed before everything.
    Used for defining rules.
     */

    // Defines that the Class cannot be initialized as an Object without its attributes.
    public Film(String name, String genre, double imdbScore, boolean isWatched) {
        System.out.println("Inside Constructor 1");

        setName(name);
        setGenre(genre);
        setImdbScore(imdbScore);
        setWatched(isWatched);
    }

    // Overloading Constructor.
    public Film() {
        System.out.println("Inside empty Constructor");
    }

    // Overloading Constructor again.
    public Film(String name, String genre, double imdbScore, boolean isWatched, String director) {
        // Calling a constructor inside a constructor.
        // This can be used to add new features or attributes without breaking existing code.

        // I really don't like Java... but I don't seem to like anything, so whatever, keep going.

        // this() can only be used inside Constructors that call Constructors.
        this(name, genre, imdbScore, isWatched);
        System.out.println("Inside director's Constructor that calls Constructor 1");

        setDirector(director);
    }

    public void printInfo() {
        System.out.print("\n");
        System.out.println(getName());
        System.out.println(getGenre());
        System.out.println(getImdbScore());
        System.out.println(isWatched());
        System.out.println(getDirector());
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
