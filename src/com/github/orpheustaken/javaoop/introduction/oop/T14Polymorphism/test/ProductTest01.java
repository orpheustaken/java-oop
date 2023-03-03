package com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.test;

import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Cellphone;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Computer;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.domain.Tomato;
import com.github.orpheustaken.javaoop.introduction.oop.T14Polymorphism.service.ProductTaxReportService;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Framework Laptop", 1000);
        Tomato tomato = new Tomato("Italian", 5);
        Cellphone cellphone = new Cellphone("Pixel", 1000);

        // Methods called directly from the Class because they are static.
//        ProductTaxReportService.generateComputerTaxReport(computer);
        System.out.println(" ");

        ProductTaxReportService.generateTaxReport(computer);

        System.out.println(" ");

//        ProductTaxReportService.generateTomatoTaxReport(tomato);
        ProductTaxReportService.generateTaxReport(tomato);

        System.out.println(" ");

        ProductTaxReportService.generateTaxReport(cellphone);
    }
}
