package com.example.javafundametal.basic.branching;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("simple calculator");
        System.out.print("input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("input second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("=======================");
        System.out.print("choose operator [+, -, *, /] : ");
        String operator = scanner.next();

        System.out.println();
        int result = 0;
        switch (operator) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = firstNumber / secondNumber;
            default -> System.out.println("invalid operator");
        }
        System.out.println("result = " + result);
    }
}
