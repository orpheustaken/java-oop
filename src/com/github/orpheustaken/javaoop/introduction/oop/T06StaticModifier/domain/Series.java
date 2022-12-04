package com.github.orpheustaken.javaoop.introduction.oop.T06StaticModifier.domain;

public class Series {
    private String name;
    private static int[] episodes;

    // Static init block will be called only once.
    static {
        System.out.print("\n");
        System.out.println("Inside Instance Initialization Block");
        System.out.print("\n");
    }

    // Constructor.
    public Series(String name) {
        this.name = name;
        System.out.println("Constructor 1");
    }

    // Overloaded Constructor.
    public Series() {
        System.out.println("Overloaded Constructor with Iteration");
        episodes = new int[100];

        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }

        for (int episode : Series.episodes) {
            System.out.print(episode + ", ");
        }

        System.out.print("\n");
    }

    // Getters.
    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
