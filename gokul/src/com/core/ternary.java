package com.core;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        String result = (score >= 50) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

     
    }
}
