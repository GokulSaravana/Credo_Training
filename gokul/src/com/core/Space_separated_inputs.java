package com.core;
import java.util.Scanner;

public class Space_separated_inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter space-separated values: ");
        String input = scanner.nextLine();

        String[] values = input.split(" ");

        System.out.println("Input values:");

        
       for (String value:values) {
    	   System.out.print(value);
       }
    }
}

