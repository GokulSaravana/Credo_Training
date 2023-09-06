package com.java;
//Arrayofobjects
public class Student1 {


	    public int Rollno;

	    public String name;

	    Student1(int Rollno,String name){  //parameterized constructor

	        this.Rollno=Rollno;
	        this.name=name;

	 

	    }

	    void print() {

	        System.out.println("Name   :"+name);
	        System.out.println("Age     :"+Rollno);
	    }
	}

	 

	 

	public class Student {

	 

	    public static void main(String[] args) {

//	        Student m=new Student(101,"Credo");     //0 1 2 
//	                m.print();
//	        
//	                Student m1=new Student(102,"Mukesh");
//	                m1.print();


	        Student [] m;

	                m= new  Student[5];

	                m[0]=new Student(1, "Credo");
	                m[1]=new Student(2, "steve");
	                m[2]=new Student(3, "grace");
	                m[3]=new Student(4, "madhan");
	                m[4]=new Student(5, "mukesh");

	                for(int i=0;i<m.length;i++) {
	                    m[i].print();
	                }




	    }

	 

	

	}


