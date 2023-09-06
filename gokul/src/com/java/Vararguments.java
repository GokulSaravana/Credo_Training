package com.java;





public class Vararguments {


    public static void   getNames(String...  names) {


//        System.out.println(names[0]);

//        System.out.println(names[1]);



        for(String name:names) {      //enhanced forloop


               System.out.println(name);

        }



    }

 

    public static void main(String[] args) {



        getNames("credo","steve","varrg","mukesh","ram","sekar");    //to pass the multiple parameter in runtime 



 

    }

 

}