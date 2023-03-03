package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.service;

import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.repository.Repository;

public class FileRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in a File...");
    }
}
