package com.github.orpheustaken.javaoop.introduction.oop.T05InitializationBlock.domain;

public class Series {
    private String name;
    private int[] episodes;

    // Instance Initialization Block.
    // Gets called before Constructor.
    // Will always be executed at each Object Initialization.

    // Usually used to initialize attributes.
    {
        System.out.print("\n");
        System.out.println("Inside Instance Initialization Block");
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

        for (int episode : episodes) {
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
