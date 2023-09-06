package com.java;
import java.util.HashMap;
import java.util.HashSet;



public class Hashsetdemo {

 

    public static void main(String[] args) {

        HashSet<String> hs= new HashSet<String>();

                  hs.add("java");
                  hs.add("Python");
                  hs.add("C++");
                  hs.add("C");

                  System.out.println("before adding duplicate elements and null ");
                  System.out.println(hs);

                  hs.add("Python");
                  hs.add("C");

                  System.out.println("After  adding duplicate elements and null ");
                  System.out.println(hs);

                  //adding null values 

                  hs.add(null);
                  hs.add(null);

                  System.out.println("After  adding  null ");
                  System.out.println(hs);
                  
                  
                  
                  
                  
                  

HashMap<Integer,String > hm =new HashMap<Integer, String>();



        // elements to be add


        hm.put(12, "Credo");

        hm.put(2, "Cow");

        hm.put(7, "Deer");


        System.out.println("hashmap objects are here :\n\n"+hm);


        //eneter into duplicate values 


        hm.put(7, "credo");

        hm.put(12, "Deer");

        hm.put(1, "Cow");



        System.out.println("hashmap objects are here :\n\n"+hm);


 

 

    }

 

}