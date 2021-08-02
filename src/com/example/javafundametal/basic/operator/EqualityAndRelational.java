package com.example.javafundametal.basic.operator;

public class EqualityAndRelational {
    public static void main(String[] args) {

        int firstValue = 3;
        int secondValue = 4;
        boolean result;

        //Equality
        result = firstValue == secondValue;
        System.out.println(firstValue + " is equal to " + secondValue + " = " + result);
        System.out.println();

        //Un-Equality
        result = firstValue != secondValue;
        System.out.println(firstValue + " is not equal to " + secondValue + " = " + result);
        System.out.println();

        //Greater-Than
        result = firstValue > secondValue;
        System.out.println(firstValue + " is Greater Than " + secondValue + " = " + result);
        System.out.println();

        //Greater-Than-Equal
        result = firstValue >= secondValue;
        System.out.println(firstValue + " is Greater Than Equal " + secondValue + " = " + result);
        System.out.println();


        //Less-Than
        result = firstValue < secondValue;
        System.out.println(firstValue + " is Less Than " + secondValue + " = " + result);
        System.out.println();

        //Less-Than-Equal
        result = firstValue <= secondValue;
        System.out.println(firstValue + " is Less Than Equal " + secondValue + " = " + result);
        System.out.println();
    }
}
