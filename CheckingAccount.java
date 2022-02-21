package com.company;

public class CheckingAccount extends Account { //child of the Account class

    private static double FEE = 2.5; //transaction fee

    public CheckingAccount() { //default constructor
        super();
    }

    public CheckingAccount(int accountNumber, double fee) { //constructor to initialize CheckingAccount with accountNumber amd fee
        super(accountNumber);
        FEE = fee;
    }

    /**
     * @param amount value to be deposited
     */
    public void deposit(double amount) { // function to deposit money to account
        if( amount > 0) { //checking if the amount is more than 0
            balance += amount; //add it to the amount we had
            System.out.printf("Amount %.2f deposited%n", amount);
            balance -= FEE; //then subtracting transaction fee
            System.out.printf("Fee %.2f Applied%n", FEE);
            System.out.printf("Current Balance is: %.2f%n", balance);
        } else { //deposited amount cannot be less than 0
            System.out.println("A negative amount cannot be deposited");
        }
    }

    /**
     * @param amount value to be withdrawn
     */
    public void withdraw(double amount) { //function to withdraw the money from account
        if(amount > 0) { //checking if the amount is more than 0
            if((amount+FEE) <= balance) { //checking whether we have enough money to withdraw
                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount; //subtracting the withdrawal amount and transaction fee from the balance
                balance -= FEE;
                System.out.printf("Fee of %.2f applied%n", FEE);
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
        } else { //withdrawal amount cannot be less than 0
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}