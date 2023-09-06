package com.java;

import java.io.IOException;

public class Throws {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IoException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) {
        
        throw new IoException("File not found or error while reading.");
    }
}





import java.io.IOException;

public class ThrowsWithoutThrowExample {
    public static void main(String[] args) {
        try {
            processFile("myfile.txt");
        } catch (IOException e) {
            System.out.println("An IO exception occurred: " + e.getMessage());
        }
    }

    public static void processFile(String filename) throws IOException {
        if (!filename.endsWith(".txt")) {
            throw new IOException("Invalid file format");
        }
        // Process the file...
    }
}
