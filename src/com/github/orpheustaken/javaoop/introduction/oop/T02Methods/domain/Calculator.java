package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    // Similar to C:
    public void multiplyWithParams(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public int divideWithParamsReturn(int num1, int num2) {
        return num1 / num2;
    }

    public void sumArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }

    // TF would I use this?
    // Oh, ok.
    // With this I can send the array values directly in the arguments.
    // See CalculatorTest03.
    public void sumVarArgs(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
