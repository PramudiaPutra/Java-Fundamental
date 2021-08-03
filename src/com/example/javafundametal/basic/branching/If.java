package com.example.javafundametal.basic.branching;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input odd number: ");
        int number = scanner.nextInt();

        if (number % 2 ==  1) {
            System.out.println(number + " is an odd number");
        }

    }
}
