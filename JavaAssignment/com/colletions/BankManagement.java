package com.colletions;

import java.util.*;

public class BankManagement {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Add accounts
        bankingSystem.addAccount(new BankAccount(101, "Priya", 5000));
        bankingSystem.addAccount(new BankAccount(102, "Ramya", 3000));
        bankingSystem.addAccount(new BankAccount(103, "Shalini", 0));
        bankingSystem.addAccount(new BankAccount(104, "Diana", 12000));
        bankingSystem.addAccount(new BankAccount(105, "Dilly", 0));
        System.out.println("All Accounts:");
        bankingSystem.displayAccounts();

        // Deposit money
        bankingSystem.deposit(101, 2000);
        bankingSystem.deposit(103, 1000);

        System.out.println("\nAfter Deposits:");
        bankingSystem.displayAccounts();

        // Withdraw money
        bankingSystem.withdraw(102, 500);

        System.out.println("\nAfter Withdrawal:");
        bankingSystem.displayAccounts();

        // Remove inactive accounts
        bankingSystem.removeInactiveAccounts();

        System.out.println("\nAfter Removing Inactive Accounts:");
        bankingSystem.displayAccounts();

        //  highest balance
        Optional<BankAccount> highest = bankingSystem.getAccountWithHighestBalance();
        highest.ifPresent(account -> System.out.println("\nAccount with Highest Balance: " + account));

        //  lowest balance
        Optional<BankAccount> lowest = bankingSystem.getAccountWithLowestBalance();
        lowest.ifPresent(account -> System.out.println("\nAccount with Lowest Balance: " + account));
    }
}
