package com.mwu.lowcoupling;

public class DebitCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing debit card payment of $%.2f%n", amount);
    }
}
