package com.example.javafundametal.basic.looping;

import java.util.Scanner;

public class NestedFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("how big is the triangle (input number): ");
        int triangleSize = scanner.nextInt();

        for (int i = 0; i <= triangleSize; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
