package com.mwu.lowcoupling;


public class BankTransferPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing bank transfer payment of $%.2f%n", amount);
    }
}
