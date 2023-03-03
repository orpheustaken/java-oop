package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.test;

import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Computer;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Product;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        // Widening Cast: Superclass as reference var and Subclass as Object.
        // Product is the reference var, but Computer is the Object reponsible to execute the methods.
        Product product01 = new Computer("Ryzen 9", 1000);

        System.out.println(product01.getName());
        System.out.println(product01.getPrice());
        System.out.println(product01.calculateTaxValue());

        System.out.println(" ");

        Product product02 = new Tomato("Italian", 10);
        Tomato tomato = new Tomato("Dutch", 20);

        System.out.println(product02.getName());
        System.out.println(product02.getPrice());
        // calculateTaxValue() can still be called from the Object because it's implemented in Product.
        System.out.println(product02.calculateTaxValue());
        // Product can't call expDate because it's only defined in Tomato.
//        System.out.println(product02.getExpDate);

        // Tomato reference type knows about expDate, but not Product.
        System.out.println("Tomato: " + tomato.getName() + " " + tomato.getExpDate());
    }
}
