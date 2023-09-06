package com.java;
import java.util.ArrayList;
import java.util.List;

 

public class Arraylistdemo {

 

    public static void main(String[] args) {

 

        /*
         * Arraylist intial capacity 10 but it can be resizable Heterogeneous objects
         * are allowed (Diffrent obj) 
         * duplicates elements are allowed 
         * data retrival fast
         * 
         */

 

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add("Credo");
        al.add("OMR");
        al.add("ECR");

        al.add(2, "addition"); // position too add
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(0)); // position too fetch 
        System.out.println(al.contains("Credo"));
        System.out.println(al.remove("ECR"));
        System.out.println(al);


        ArrayList al1 = new ArrayList();
                al1.addAll(al);          // 

                System.out.println("al1 list is "+al1);


                ArrayList al2 = new ArrayList();

                al2.add("cat");
                al2.add("cow");
                al2.add("cow");
                al2.add("Deer");
                al2.add("Deer");

                System.out.println("Al2 list is"+al2);


                List al4 = al2.subList(0, 1);
                System.out.println(al4);


    }

 

}