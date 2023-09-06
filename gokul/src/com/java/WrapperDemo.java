package com.java;

public class WrapperDemo {

	 

    public static void main(String[] args) {

 

        

        int i=10;// primi

        float f;


        Integer i2=Integer.valueOf(15); // boxing and wrapping


        int j=i2.intValue();  //unboxing unwrapping 


        Integer i3=20; //Integer.valueOf(i3)i=20 automatically ----> autoboxing 


        int k=i2;  //


        String s="123";  //intger.parseint 


        int i4=Integer.parseInt(s);  //to convert string into integer


        System.out.println(i4);

 

    }

 

}