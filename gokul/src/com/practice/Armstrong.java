package com.practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int n = scanner.nextInt();
        int a;
        int sum1=0;
        int orgnum=n;
        while(n>0) {
        	a=n%10;
        	sum1=sum1+(a*a*a);
        	n=n/10;
        }
        if(sum1==orgnum) {
        	 System.out.print("Yes,it is an Armstrong number");
        }
       else {
    	 System.out.print("No,it is not an Armstrong number");
    }
}}