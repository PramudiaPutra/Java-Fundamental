package com.example.javafundametal.basic.branching;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("is today raining? [y/n] ");
        String isRaining = scanner.next();

        if (isRaining.equals("y")) {
            System.out.println("don't forget to bring an umbrella");
        } else {
            System.out.println("have a nice day");
        }
    }
}
