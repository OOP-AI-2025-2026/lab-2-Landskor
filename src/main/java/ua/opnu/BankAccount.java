package ua.opnu;

public class BankAccount {
    public String name;
    public double balance;
    public double transactionFee;

    public BankAccount() {
        this.name = "";
        this.balance = 0.0;
        this.transactionFee = 0.0;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.transactionFee = 0.0;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount + this.transactionFee) {
            this.balance = this.balance - amount - this.transactionFee;
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount receiver, double amount) {
        if (this.balance >= amount + this.transactionFee) {
            this.balance = this.balance - amount - this.transactionFee;
            receiver.balance = receiver.balance + amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return this.balance;
    }
}