package com.java;

 

public class SimpleOne1 {

 

    public static void main(String[] args) {

 

        Circle cc = new Circle();

        Circle cc1 = new Circle(20);

        Circle cc2 = new Circle(7.9);

        Circle cc3 = new Circle("welcome to constructor class");

        System.out.println("my constructor is called now");
        System.out.println("the circle measurement is--------" + cc.area());

    }

}

 

class Circle {

 

    int length, width;

 

    public Circle() { // no return type

 

        length = 10;
        width = 20;

 

    }

    public  Circle(int a) {

        System.out.println(a*a);

    }

    public  Circle(double a) {

        System.out.println(a*a);

    }

public  Circle(String a) {

        System.out.println(a);

    }

 


    int area() { // with return

 

        int a = length * width;

 

        return a;

 

    }
}
