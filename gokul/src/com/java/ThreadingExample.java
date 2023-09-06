package com.java;
public class ThreadingExample {
    public static void main(String[] args) {
     
        Thread musicThread = new Thread(new MusicPlayer());
        Thread userThread = new Thread(new UserInteraction());
        musicThread.start();
        userThread.start();
    }
}

class MusicPlayer implements Runnable {
    public void run() {
        System.out.println("Music is playing...");
        
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Music has stopped.");
    }
}

class UserInteraction implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("User is interacting: " + i);
      
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}