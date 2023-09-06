package com.java;

public class Gfa {
    public static void main(String[] args) {
        Father ff = new Father();
        ff.house();
        ff.vila();
    }
}

class Grandfather {
    public void vila() {
        System.out.println("I do have my own villa at my hometown");
    }
}

class Father extends Grandfather {
    public void house() {
        System.out.println("I do have own flat at Chennai");
    }
}
​​