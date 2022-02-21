package com.company;

public abstract class Account { //creating an abstract class
    private int accountNumber; //initializing account number
    protected double balance; //initializing the balance

    public Account() { //default constructor
    }

    public Account(int accountNumber) { //constructor to initialize Account with accountNumber
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public double getBalance() { //using getter method
        return this.balance;
    }

    public int getAccountNumber() { //using getter method
        return this.accountNumber;
    }

    /**
     * @param amount value to be deposited
     */
    public abstract void deposit(double amount); //function to deposit money to account

    /**
     * @param amount value to be withdrawn
     */
    public abstract void withdraw(double amount);
}