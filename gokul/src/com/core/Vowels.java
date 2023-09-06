package com.core;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		String arr="aeiouAEIOU";
		Scanner sc = new Scanner(System.in);
		int count=0;
        System.out.print("Enter a string: ");
        String str = sc.next();
        for (int i=0;i<str.length();i++) {
        	if (arr.contains(String.valueOf(str.charAt(i)))) {
        		count++;
        	}
        	
        }System.out.println("There are "+count+" Vowels");

	}

}
