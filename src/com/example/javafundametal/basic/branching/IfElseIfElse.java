package com.example.javafundametal.basic.branching;

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {

        System.out.print("input your score: ");
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        String scoreIndex;

        if (score >= 90) {
            scoreIndex = "A";
        } else if (score >= 80) {
            scoreIndex = "B";
        } else if (score >= 70) {
            scoreIndex = "C";
        } else if (score >= 60) {
            scoreIndex = "D";
        } else {
            scoreIndex = "E";
        }
        System.out.println("you score is : " + scoreIndex);
    }
}
