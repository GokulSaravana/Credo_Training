package com.core;

public class tables {
    public static void main(String[] args) {
        int number = 5; // The number for which we want to generate the multiplication table
        
        System.out.println("Multiplication Table for " + number + ":");
        
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
