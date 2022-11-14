package com.github.orpheustaken.javaoop.introduction.basics;

public class T06Arrays {
    // Arrays and Strings in Java are Object Reference Types.

    // Primitive Vars store the actual value.
    // Reference Vars store addresses of Objects they refer to.

    // Just like C.

    public static void main(String[] args) {
        // IntelliJ complain if I declare Arrays like I do in C =/
        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
    }
}
