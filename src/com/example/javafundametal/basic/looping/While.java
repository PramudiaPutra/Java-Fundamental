package com.example.javafundametal.basic.looping;

public class While {
    public static void main(String[] args) {

        int loopSize = 10;
        int loopCount = 1;

        while (loopCount <= loopSize) {
            System.out.println("Loop Number : " + loopCount);
            loopCount++;
        }
    }
}
