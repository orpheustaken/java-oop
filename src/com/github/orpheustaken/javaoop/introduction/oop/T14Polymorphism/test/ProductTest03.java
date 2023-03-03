package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.test;

import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Computer;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Product;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Tomato;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.service.ProductTaxReportService;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Intel I9", 1000);

        Tomato tomato = new Tomato("Italian Tomato", 10);
        tomato.setExpDate("0523");

        System.out.println(" ");

        ProductTaxReportService.generateTaxReport(tomato);

        System.out.println(" ");

        // Computer does not have expDate.
        // Class cast expection when Narrowing Cast for tomato happens in this method.
        // And there's no validation for the tomato specifically.
        // An if statement with the instanceof Tomato will fix this.
        ProductTaxReportService.generateTaxReport(product);
    }
}
