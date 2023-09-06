package com.practice;

import java.util.Scanner;

public class Sumofdigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find the sum of its digits: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int temp = number; temp != 0; temp /= 10) {
            int digit = temp % 10;
            sum += digit;
        }

        System.out.println("Sum of digits of " + number + " = " + sum);
    }
}
