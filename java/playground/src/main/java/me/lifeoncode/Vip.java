package me.lifeoncode;

public class Vip {
    private final String name;
    private final String email;
    private final double credLimit;

    public Vip() {
        this("unknown", "unknown@email.com", 0.0);
    }

    public Vip(String name, String email) {
        this(name, email, 75_000.0);
    }

    public Vip(String name, String email, double credLimitAmount) {
        this.name = name;
        this.email = email;
        this.credLimit = credLimitAmount;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public double getCredLimit() {
        return this.credLimit;
    }
}
