package com.github.orpheustaken.javaoop.introduction.basics;

public class T06Arrays {
    // Arrays and Strings in Java are Object Reference Types.

    // Primitive Vars store the actual value.
    // Reference Vars store addresses of Objects they refer to.

    // Just like C.

    public static void main(String[] args) {
        // IntelliJ complains if I declare Arrays like I do in C =/
        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] numbers2 = {1, 2, 3, 4, 5};

        // Enhanced for? Foreach.
        for (int number : numbers2) {
            System.out.println(number);
        }

        /*
        Default initialization values:
        Objects are initialized as null.

        int, byte, short, double, float, long = 0
        char = \u0000 (which is unicode for blank value)
        boolean = false
        String null (as it is an Object)
         */
    }
}
