package com.github.orpheustaken.javaoop.introduction.oop.T13Interfaces.domain;

// Note how the keyword here is not extends but implements.

// A single Class can have multiple implementations of different Interfaces.
public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database...");
    }
}
