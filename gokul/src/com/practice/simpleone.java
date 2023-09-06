package com.practice;

public class simpleone {
    public static void main(String[] args) {
        circle cc = new circle();
        cc.length = 20;
        cc.width = 10;
        System.out.println("The circle measurement is: " + cc.area());
    }
}

class circle {
    int length, width;

    public void shape(int x, int y) {
        // no return type
        length = x;
        width = y;
    }

    int area() {
        // with return
        int a = length * width;
        return a;
    }
}
