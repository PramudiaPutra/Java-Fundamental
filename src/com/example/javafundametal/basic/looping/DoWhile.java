package com.example.javafundametal.basic.looping;

public class DoWhile {
    public static void main(String[] args) {
        int loopSize = 10;
        int loopCount = 1;

        do {
            System.out.println("Loop Number : " + loopCount);
            loopCount++;
        } while (loopCount <= loopSize);
    }
}
