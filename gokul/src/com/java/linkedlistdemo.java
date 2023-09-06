package com.java;


import java.util.LinkedList;

 

public class linkedlistdemo {

 

    public static void main(String[] args) {


/* Element insertion/Deletion faster

* Element reterival is not faster 

* 

* */        



        LinkedList al = new LinkedList();


        al.add(10);

        al.add(20);

        al.add(30);

        al.add(40);

        al.add(50);

        al.add("Credo");

        al.add("OMR");

        al.add("ECR");

        System.out.println(al);

        al.addFirst("first ele");

        System.out.println(al);

        al.removeLast();

        System.out.println(al);

//        al.clear();

//        System.out.println(al);


        LinkedList al1 =  (LinkedList)al.clone(); // it will clone the obj

        System.out.println("cloned the obj now"+al1);

 

    }

 

}