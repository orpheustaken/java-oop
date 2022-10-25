package com.github.orpheustaken.javaoop.introduction;

public class PrimitiveTypes {
    public static void main(String[] args) {
        /*
            Java primitive types are:
            int, double, float, char, byte, short, long, boolean
            Just like C.
         */

        int varInt = -2147483648;
        long varLong = -9223372036854775808L;
        double varDouble = -2.147483648;
        float varFloat = -2.147483648F;
        byte varByte = -128;
        short varShort = -32768;
        boolean varTrue = true;
        boolean varFalse = false;
        char varChar = 'A'; // As C, single quotation means charactere.
        char varCharASCII = 65; // Can also use ASCII values.

        System.out.println("Integer is " + varInt + ".");
        System.out.println("Long is " + varLong + ".");
        System.out.println("Double is " + varDouble + ".");
        System.out.println("Float is " + varFloat + ".");
        System.out.println("Byte is " + varByte + ".");
        System.out.println("Short is " + varShort + ".");
        System.out.println("Boolean is " + varTrue + ".");
        System.out.println("Boolean is " + varFalse + ".");
        System.out.println("Char is " + varChar + ".");
        System.out.println("ASCII Char 65 is " + varCharASCII + ".");
    }
}
