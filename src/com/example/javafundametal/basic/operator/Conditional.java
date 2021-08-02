package com.example.javafundametal.basic.operator;

public class Conditional {
    public static void main(String[] args) {
        int firstValue = 3;
        int secondValue = 4;
        boolean result;

        //AND
        System.out.println("Conditional AND");
        result = firstValue == 3 && secondValue < 6;
        System.out.println(firstValue + " is equal to " + 3 + " AND " + secondValue + " is less than " + 6 + " = " + result);

        result = firstValue < 3 && secondValue < 6;
        System.out.println(firstValue + " is less than " + 3 + " AND " + secondValue + " is less than " + 6 + " = " + result);
        System.out.println();

        //OR
        System.out.println("Conditional OR");
        result = firstValue != 3 || secondValue == 4;
        System.out.println(firstValue + " is not equal to " + 3 + " OR " + secondValue + " is equals to " + 4 + " = " + result);

        result = firstValue == 3 || secondValue == 4;
        System.out.println(firstValue + " is equal to " + 3 + " OR " + secondValue + " is equals to " + 4 + " = " + result);

        result = firstValue != 3 || secondValue > 4;
        System.out.println(firstValue + " is not equal to " + 3 + " OR " + secondValue + " is greater than " + 4 + " = " + result);


    }
}
