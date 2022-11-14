package com.github.orpheustaken.javaoop.introduction.basics;

public class T05LoopStatements {
    public static void main(String[] args) {
        // Again, Just as C.

        int i = 0;

        // While loop:
        while (i < 10) {
            System.out.println("While loop " + i);
            i++;
        }

        // Do-while loop:
        do {
            System.out.println("Do-while loop " + i);
            i++;
        } while (i < 0);

        // For loop:
        for (int j = 0; j < 10; j++) {
            System.out.println("For loop: " + j);
        }

        // Also, there's the break and continue statements to be used inside loops.
        // break; Interrupts the loop and EXIT.
        // continue; Interrupts the loop and RUN ANOTHER ITERATION;
    }
}
