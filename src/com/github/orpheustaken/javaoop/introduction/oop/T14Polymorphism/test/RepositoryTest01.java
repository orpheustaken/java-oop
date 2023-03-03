package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.test;

import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.repository.Repository;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.service.DatabaseRepositoryService;
//import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.service.FileRepositoryService;
//import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.service.InMemoryRepositoryService;

public class RepositoryTest01 {
    public static void main(String[] args) {
        // Interface Oriented Programming states that Reference Vars should always be an Interface:
        Repository repository = new DatabaseRepositoryService();

        // This approach makes it easier to change requirements.
        // Reference Type will always be the Interface,
        // but it will execute methods from different Objects.

//        Repository repository = new InMemoryRepositoryService();
//        Repository repository = new FileRepositoryService();

        repository.save();
    }
}
