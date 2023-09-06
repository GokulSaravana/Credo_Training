package com.java;

final class first{


    void show() {



    }



}

 

class second extends first{


void show() {


    System.out.println("this is my child class");



    }



}

 

public class FinalDemo implements Runnable {

 

    public static void main(String[] args) {


        // final --> variable ,method, class

          //variable--> constant 



        final int a=20;


//        a=21;


        System.out.println(a);


        second yy =new second();


              yy.show();


 

    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

 

}