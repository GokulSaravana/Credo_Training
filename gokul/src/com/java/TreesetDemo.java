package com.java;


import java.util.Iterator;

import java.util.TreeSet;

 

public class TreesetDemo {

 

 

    public static void main(String[] args) {


/*asending order 

*it will not allowed null values 

* data retrival quiet fast 

* 

* Heterogeneous objects (string, Integer)

* 

* 

* */        


        TreeSet<Integer> numbers = new TreeSet<Integer>();

                         numbers.add(2);

                         numbers.add(5);

                         numbers.add(6);

                         System.out.println("Treeset"+numbers);


//                         boolean value1 = numbers.remove(5);

//        

//                         System.out.println("removed "+value1);

//                         

//                         boolean value2 = numbers.removeAll(numbers);

//                         System.out.println("removed All"+value2);


//                         int first = numbers.first();

//                         System.out.println("first"+first);

//                         

//                         int last = numbers.last();

//                         System.out.println("last"+last);



                         System.out.println("its my higher.....:"+numbers.higher(5));


                         System.out.println("its my lower.....:"+numbers.lower(5));


                         System.out.println("its my ceiling.....:"+numbers.ceiling(4));

                         System.out.println("its my floor .....:"+numbers.floor(3));


//                         while(Iterator.)






    }

 

}