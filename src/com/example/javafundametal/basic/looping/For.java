package com.example.javafundametal.basic.looping;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("how many number to print: ");
        int maxNumber = scanner.nextInt();

        for (int i = 0; i < maxNumber; i++ ) {
            System.out.println(i+1);
        }
    }
}
