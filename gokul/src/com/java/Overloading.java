package com.java;

class loading{


    public static int multiply(int a,int b) {

      return a*b;


  }

    public static  double multiply (double a,double b) {

      return a*b ;


  }


    public static int multiply(int r) {

      return r*r;


  }

}



public class Overloading {



  public static void main(String[] args) {


      System.out.println("the multiply answer is "+loading.multiply(15, 15));

      System.out.println("the multiply answer is "+loading.multiply(2.6,8.9));

      System.out.println("the multiply answer is "+loading.multiply(10));




  }



}