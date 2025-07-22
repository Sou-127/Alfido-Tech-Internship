
package com.mycompany.task3;


class Account {
    String accountHolder;
    double balance;

    
    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }

    
    void applyMonthlyUpdate() {
        System.out.println("Base account has no monthly update.");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}


class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    void applyMonthlyUpdate() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }
}


class CurrentAccount extends Account {
    double monthlyFee;

    CurrentAccount(String accountHolder, double balance, double monthlyFee) {
        super(accountHolder, balance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    void applyMonthlyUpdate() {
        balance -= monthlyFee;
        System.out.println("Monthly fee deducted: ₹" + monthlyFee);
    }
}


public class Task3 {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("Alice", 10000, 3.5);
        Account acc2 = new CurrentAccount("Bob", 8000, 200);

        System.out.println("\n--- Savings Account ---");
        acc1.displayInfo();
        acc1.applyMonthlyUpdate(); 
        acc1.displayInfo();

        System.out.println("\n--- Current Account ---");
        acc2.displayInfo();
        acc2.applyMonthlyUpdate(); 
        acc2.displayInfo();
    }
}
