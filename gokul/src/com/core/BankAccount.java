package com.core;
public class BankAccount {
    public static void main(String[] args) {
        final double BALANCE = 1000.0; // Initial account balance (constant value)
        double withdrawalAmount = 200.0; // Amount to be withdrawn

        double remainingBalance = BALANCE - withdrawalAmount; // Calculate remaining balance

        System.out.println("Account Balance: " + BALANCE);
        System.out.println("Withdrawal Amount: " + withdrawalAmount);
        System.out.println("Remaining Balance: " + remainingBalance);
        if (remainingBalance<1000) {
        	System.out.println("Below Minimum Balance");
        }
    }
}

