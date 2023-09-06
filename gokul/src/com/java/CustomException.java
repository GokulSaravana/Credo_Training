package com.java;

public class CustomException {
    public static void main(String[] args) {
        try {
            validateInput(101);
        } catch (CustomCheckedException e) {
            System.out.println("CustomCheckedException caught: " + e.getMessage());
        }
    }

    public static void validateInput(int value) throws CustomCheckedException {
        if (value > 100) {
            throw new CustomCheckedException("Value must not exceed 100.");
        }
    }
}
