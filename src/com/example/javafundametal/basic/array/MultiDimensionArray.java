package com.example.javafundametal.basic.array;

public class MultiDimensionArray {
    public static void main(String[] args) {
        //Declaring 2D Array
          //x-axis array
        int[][] arrays = new int[2][];
          //y-axis array
        arrays[0] = new int[1];
        arrays[1] = new int[3];

        //Initiating Array
          //x-axis array index[0]
        arrays[0][0] = 1;

          //x-axis array index[1]
        arrays[1][0] = 2;
        arrays[1][1] = 3;
        arrays[1][2] = 4;

        System.out.println("value of (0,0) = " + arrays[0][0]);
        System.out.println("value of (1,0) = " + arrays[1][0]);
        System.out.println("value of (1,1) = " + arrays[1][1]);
        System.out.println("value of (1,2) = " + arrays[1][2]);
    }
}
