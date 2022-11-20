package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.test;

import com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] numbers = {1, 2, 3, 4, 5};

        calculator.sumArray(numbers);

        calculator.sumVarArgs(1, 2, 3, 4, 5);
    }
}
