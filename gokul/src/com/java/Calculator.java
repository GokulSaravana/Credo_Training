package com.java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Menum mm = new Menum();
        mm.menum();
    }
}

class Menum {
    public void menum() {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the option \n1.Addition\n2.MulM\n3.DivD\n4.SubS");
        choice = sc.nextInt();
        if (choice == 1) {
            Addition a = new Addition();
            a.add();
            Menum mm = new Menum();
            mm.menum();
        } else if (choice == 2) {
            MulM m = new MulM();
            m.mul();
            Menum mm = new Menum();
            mm.menum();
        } else if (choice == 3) {
            DivD d = new DivD();
            d.div();
            Menum mm = new Menum();
            mm.menum();
        } else if (choice == 4) {
            SubS s = new SubS();
            s.sub();
            Menum mm = new Menum();
            mm.menum();
        } else {
            System.out.println("Thank you for using the calculator! Visit again ;)");
        }
    }
}

class Addition {
    public void add() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter your first number");
        a = sc.nextInt();
        System.out.println("Enter your second number");
        b = sc.nextInt();
        int c = a + b;
        System.out.println("Addition is --- " + c);
    }
}

class MulM {
    public void mul() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter your first number");
        a = sc.nextInt();
        System.out.println("Enter your second number");
        b = sc.nextInt();
        int c = a * b;
        System.out.println("Multiplication is --- " + c);
    }
}

class DivD {
    public void div() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter your first number");
        a = sc.nextInt();
        System.out.println("Enter your second number");
        b = sc.nextInt();
        int c = a / b;
        System.out.println("Division is --- " + c);
    }
}

class SubS {
    public void sub() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter your first number");
        a = sc.nextInt();
        System.out.println("Enter your second number");
        b = sc.nextInt();
        int c = a - b;
        System.out.println("Subtraction is --- " + c);
    }
}