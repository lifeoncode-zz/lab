package me.lifeoncode;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private String account;
    private double balance = 0.00;
    private final String name;
    private final String email;
    private final String phone;
    private Random random;

    public Bank(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        ArrayList<String> accountNums = new ArrayList<String>();

    }

    public String getAccount() {
        return this.account;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("deposit successful: +"+amount);
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("successful withdrawal: -"+amount);
        } else {
            System.out.println("unsuccessful withdrawal: insufficient funds");
        }
    }
}
