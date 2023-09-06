package com.java;
class Implementsrunnable implements Runnable{
private int counter = 0;

public void run() {

counter++;

System.out.println("implements: counter" +counter);

}
}

class Extendsthread extends Thread {

private int counter = 0;

public void run() {

counter++;

System.out.println("Extends Thread"+ counter);
}
}

public class Thread2creation {

public static void main(String[] args) throws InterruptedException {

Implementsrunnable rc = new Implementsrunnable(); 
Thread t1 = new Thread(rc);
t1.start();
Thread.sleep(3000); 
Thread t2 = new Thread(rc);
t2.start();
Thread.sleep(3000); 
Thread t3= new Thread(rc);
t3.start();

 Extendsthread tc1 = new Extendsthread();

tc1.start();
Thread.sleep(3000);

Extendsthread tc2 = new Extendsthread();

tc2.start();

Thread.sleep(3000);

Extendsthread tc3 = new Extendsthread();

tc3.start(); 
Thread.sleep(3000);
}
}