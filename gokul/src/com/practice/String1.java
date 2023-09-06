package com.practice;

import java.lang.String;

public class String1 {
    public static void main(String[] args) {
        String originalString = "Hello World!";

        String uppercaseString = originalString.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);

        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);

        char firstChar = originalString.charAt(0);
        int asciiValue = (int) firstChar;
        System.out.println("ASCII Value of the first character: " + asciiValue);

        String substring = originalString.substring(6, 11);
        System.out.println("Substring: " + substring);

        String valueToCheck = "Hello";
        boolean containsValue = originalString.contains(valueToCheck);
        System.out.println("Contains '" + valueToCheck + "': " + containsValue);
    }
}
