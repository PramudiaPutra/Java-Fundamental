package com.example.javafundametal.basic.operator;

public class Unary {
    public static void main(String[] args) {
        int defaultValue = 5;
        System.out.println("default value = " + 5);
        System.out.println();

        //Unary Plus
        System.out.println("Unary Plus");
        int plusValue = +defaultValue;
        System.out.println("plus value = " + plusValue);
        System.out.println();

        //Unary Minus
        System.out.println("Unary Minus");
        int minusValue = -defaultValue;
        System.out.println("minus value = " + minusValue);
        System.out.println();

        //Increment Operator
        System.out.println("Increment Operator");
        int incrementValue = defaultValue;
        incrementValue++;
        System.out.println("increment value = " + incrementValue);
        System.out.println();

        //Decrement Operator
        System.out.println("Decrement Operator");
        int decrementValue = defaultValue;
        decrementValue--;
        System.out.println("decrement value = " + decrementValue);
        System.out.println();

        //Logical Complement
        System.out.println("Logical Complement Operator");
        boolean isFalse = false;
        System.out.println("isFalse = " + isFalse);
        System.out.println("!isFalse = " + !isFalse);
    }

}
