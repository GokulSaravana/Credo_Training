package com.java;
class Base{   //super class or parent class


    String name;

     int Age;


     Base(String m,int n){    //we cannot override static methods.


         this.name =m;

         this.Age=n;


     }


     public void display() {            /// we r going to redefine the base class function into derived 


         System.out.println("Name    :"+name);

         System.out.println("Name    :"+Age);


    }

 

 

}

 

class Derived extends Base{    // main class 


    String Companyname;

 

    Derived(String m, int n,String c) {

        super(m, n);                                        //super keyword if we using parent class properties into child class


    this.Companyname=c;


    }   


    public void display() {                                 /// we r going to redefine the base class function into derived 


         System.out.println("Name    :"+name);

         System.out.println("Name    :"+Age);

         System.out.println("Companyname    :"+Companyname);


    }                                                               //child class or subclass

}
public class Overriding {

 

    public static void main(String[] args) {



        Derived d =new Derived("mukesh",22,"welcome to credo");


              d.display();

 

    }

 

}