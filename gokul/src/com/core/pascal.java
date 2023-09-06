package com.core;

import java.util.Scanner;

public class pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value in Pascal: ");
        int pascal = scanner.nextInt();
        
   
        int bar = pascal / 100000;
        
   
        System.out.println(pascal + " Pascal is equal to " + bar + " Bar.");
        
   
}}
