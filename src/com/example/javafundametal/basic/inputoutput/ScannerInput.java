package com.example.javafundametal.basic.inputoutput;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hello what's your name: ");
        String name = scanner.next();
        System.out.println("nice to meet you " + name);
    }
}
