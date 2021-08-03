package com.example.javafundametal.basic.array;

public class Array {
    public static void main(String[] args) {
        //Declaring Array
        int[] firstArray, secondArray;

        //Initiating Array
        firstArray = new int[5];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;

        secondArray = new int[]{6, 7, 8, 9};

        //print array
        System.out.println("first Array's value :");
        System.out.println(firstArray[0]);
        System.out.println(firstArray[1]);
        System.out.println(firstArray[2]);
        System.out.println(firstArray[3]);
        System.out.println(firstArray[4]);

        System.out.println();
        System.out.println("second Array's value :");
        System.out.println(secondArray[0]);
        System.out.println(secondArray[1]);
        System.out.println(secondArray[2]);
        System.out.println(secondArray[3]);
    }
}
