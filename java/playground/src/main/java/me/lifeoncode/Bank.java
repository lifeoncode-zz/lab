package me.lifeoncode;

import java.util.Random;

public class Bank {
    private String account;
    private double balance;
    private final String name;
    private final String email;
    private final String phone;

    public Bank(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.account = createAccountNumber();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("deposit successful: +"+amount);
        }
    }
    
    // create an account number
    public String createAccountNumber() {
        String accountNum = "";
        Random random = new Random();
        for (int i = 0; i < this.phone.length(); i++) {
            String num = String.format("%s", random.nextInt(10));
            accountNum += num;
        }
        return accountNum;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("successful withdrawal: -"+amount);
        } else {
            System.out.println("unsuccessful withdrawal: insufficient funds");
        }
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

}
