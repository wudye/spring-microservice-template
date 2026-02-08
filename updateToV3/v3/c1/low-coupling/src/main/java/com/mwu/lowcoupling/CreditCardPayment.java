package com.mwu.lowcoupling;


public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing credit card payment of $%.2f%n", amount);
    }
}
