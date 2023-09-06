package com.core;
public class StudentMarks {
    public static void main(String[] args) {
        int marks1 = 80;
        int marks2 = 75;
        int marks3 = 90;
        
        int total = marks1 + marks2 + marks3;
        int sum = total;
        double average = total / 3.0;

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
