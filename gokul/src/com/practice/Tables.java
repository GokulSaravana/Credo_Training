package com.practice;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for which you want to generate the multiplication table: ");
        int num = scanner.nextInt();

        int i = 1;

        System.out.println("Multiplication Table for " + num + ":");

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

    }
}
