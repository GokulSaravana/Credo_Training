package com.java;

import java.util.Stack;

 

public class Stackdemo {

 

    public static void main(String[] args) {


        Stack<String> stack = new Stack<String>();


        stack.push("tamil");

        stack.push("english");

        stack.push("science");

        stack.push("socialscience");

        System.out.println("The number of element is");

//        System.out.println(stack.peek());

          stack.pop();

         for (String element : stack) {


             System.out.println("" + element );


        }



 

    }

 

}