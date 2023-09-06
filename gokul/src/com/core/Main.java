package com.core;

class Person {
    void introduce() {
        System.out.println("Hi, I am a person.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("I am studying.");
    }
}

// Class trying to inherit from both Student and Teacher (diamond problem)
class StudentTeacher extends Student,Teacher { 
    // This will result in a compilation error due to the diamond problem
	 void introduce() {
	        System.out.println("Hi, I am a person.");
	    }
	 void study() {
	        System.out.println("I am studying.");
	    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of Student and Teacher
        // Creating an instance of StudentTeacher (not possible due to the diamond problem)
         StudentTeacher studentTeacher = new StudentTeacher(); // This line would cause a compilation error
         studentTeacher.introduce();
         studentTeacher.study();
         
    }
}