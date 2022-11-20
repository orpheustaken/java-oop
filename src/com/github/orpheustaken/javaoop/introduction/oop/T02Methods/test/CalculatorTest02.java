package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.test;

import com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.multiplyWithParams(2, 5);

        int divisionResult = calculator.divideWithParamsReturn(10, 2);
        System.out.println(divisionResult);
    }
}
