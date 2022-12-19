package com.github.orpheustaken.javaoop.introduction.oop.T07Association.test;

import java.util.Scanner;

public class InputKeyboardTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println();
        System.out.println("King: How is it that the clouds still hang on you?");

        System.out.print("Hamlet: ");
        String hamletAnswer1 = input.next();

        System.out.println("Queen: Good Hamlet, cast thy nighted colour off.");
        System.out.println("Queen: Do not forever with thy vailed lids seek for thy noble father in the dust.");
        System.out.println("Queen: Thou knowst tis common. All that lives must die, passing from nature to eternity.");

        System.out.print("Hamlet: ");
        String hamletAnswer2 = input2.next();

        System.out.println("Queen: If it be, why seem you so particular with this?");

        System.out.print("Hamlet: ");
        String hamletAnswer3 = input3.next();
    }
}
