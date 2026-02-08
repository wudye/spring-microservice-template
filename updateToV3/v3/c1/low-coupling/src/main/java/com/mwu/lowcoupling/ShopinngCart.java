package com.mwu.lowcoupling;

public class ShopinngCart {

    private final Payment payment;

    public ShopinngCart(Payment payment) {
        this.payment = payment;
    }
    public void checkout( double amount) {
        payment.processPayment(amount);
    }
}
