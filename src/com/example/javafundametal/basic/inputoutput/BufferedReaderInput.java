package com.example.javafundametal.basic.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("simple addition program");

        int firstValue = 0;
        int secondValue = 0;
        try {
            System.out.print("first integer value : ");
            firstValue = Integer.parseInt(bufferedReader.readLine());
            System.out.print("second integer value : ");
            secondValue = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        int result = firstValue + secondValue;
        System.out.println("result = " + result);
    }
}
