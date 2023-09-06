package com.core;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in millimeters: ");
        double millimeters = scanner.nextDouble();
        double meters = millimeters / 1000;
        System.out.println("Length in meters: " + meters);

        System.out.print("Enter length in kilometers: ");
        double kilometers = scanner.nextDouble();
        double meters2 = kilometers * 1000;
        System.out.println("Length in meters: " + meters2);

        System.out.print("Enter length in feet: ");
        double feet = scanner.nextDouble();
        double centimeters = feet * 30.48;
        System.out.println("Length in centimeters: " + centimeters);

    }
}
