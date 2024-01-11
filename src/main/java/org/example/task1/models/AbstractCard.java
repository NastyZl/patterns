package org.example.task1.models;

public abstract class AbstractCard implements Card {
    private final double balance;
    private final String id;

    public AbstractCard(String id, double balance) {
        this.balance = balance;
        this.id = id;
    }
    public abstract void transfer(double amount);

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }
}
