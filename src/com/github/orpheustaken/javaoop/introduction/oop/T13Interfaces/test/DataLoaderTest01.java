package com.github.orpheustaken.javaoop.introduction.oop.T13Interfaces.test;

import com.github.orpheustaken.javaoop.introduction.oop.T13Interfaces.domain.DataLoader;
import com.github.orpheustaken.javaoop.introduction.oop.T13Interfaces.domain.DatabaseLoader;
import com.github.orpheustaken.javaoop.introduction.oop.T13Interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        // Static concrete method from interface being called here:
        DataLoader.retrieveMaxDataSize();
    }
}
