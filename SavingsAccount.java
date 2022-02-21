package com.company;

public class SavingsAccount extends Account { //child of the Account class

    private double interestRate; //interest rate

    public SavingsAccount() { //default constructor
        super();
    }

    public SavingsAccount(int accountNumber, double interestRate) { //constructor to initialize SavingsAccount with accountNumber and interestRate
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { //getter method
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) { //getter method
        this.interestRate = interestRate;
    }

    public double calcInterest() { //function to calculate the interest
        return balance * interestRate;
    }

    public void applyInterest() { //function to get the profit
        double interest = calcInterest();
        System.out.printf("Interest amount %.2f added to balance%n", interest);
        deposit(interest);
    }

    /**
     * @param amount value to be deposited
     */
    public void deposit(double amount) { // function to deposit money to account
        if (amount > 0) { //checking if the amount is more than 0
            balance += amount; //add it to the amount we had
            System.out.printf("Amount %.2f deposited%n", amount);
            System.out.printf("Current Balance is: %.2f%n", balance);
        } else { //deposited amount cannot be less than 0
            System.out.println("A negative amount cannot be deposited");
        }
    }

    /**
     * @param amount value to be withdrawn
     */
    public void withdraw(double amount) { //function to withdraw the money from account
        if (amount > 0) { //checking if the amount is more than 0
            if ((amount) <= balance) { //checking whether we have enough money to withdraw
                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;//subtracting the withdrawal amount from the balance
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
        } else { //withdrawal amount cannot be less than 0
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}