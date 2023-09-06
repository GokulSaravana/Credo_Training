package com.java;

 

 

class Nest{

    private int m,n;

    Nest(int m,int n){

        this.m=m;       //parameterized 

        this.n=n;

    }

    int highest() {

        if(m>n)

            return m;

        else
            return n;

    }

    void output() {

        int high = highest();         // another function are called here call nested method 

        System.out.println("the greatedt number is "+ high);
    }


}

 

public class Nesting1 {                   //if we use function inside the function called nesting metod

 

    public static void main(String[] args) {

        Nest o =new Nest(23,34);
            o.output();



 

    }

 

}

