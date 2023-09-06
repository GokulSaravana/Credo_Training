package com.java;

import java.io.File;
import java.io.FileInputStream;

 

public class Testclas {

 

    public static void main(String[] args) {

 

        int a = 10;
        int b = 0;

 

        int c;

 

        try { // to write the code logic

 

//            c = a / b;

            int arr[]=null;
               System.out.println(arr[1]);

 

        }
        catch (ArithmeticException e) { // to catch the error n

 

            System.err.println("ArithmeticException Error occcured");

 

        } catch(NullPointerException e) {

            System.err.println("NullPointerException Error occcured");


//        } catch (Exception e) {
//            
//            System.out.println("error occur here ");

//        }finally {                                        // it will execute the final statment 
//            
//            System.out.println("this is my finnal block execute here ");
//        }



 

    }

 

}
}