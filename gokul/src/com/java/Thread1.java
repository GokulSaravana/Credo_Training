package com.java;
public class Thread1{

public static void main(String[] args) {

Thread t = Thread.currentThread();

System.out.println("current Thread"+t);

t.setName("My Thread");

System.out.println("After Name Change"+t);

try {

for(int n=5;n>0;n--) {

System.out.println(n); 
Thread.sleep(1000);
}
}
catch (InterruptedException e) {

System.out.println("main thread is Interrupted"+e);
}
}
}