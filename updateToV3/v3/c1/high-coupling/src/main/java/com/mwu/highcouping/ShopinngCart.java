package com.mwu.highcouping;

public class ShopinngCart {

    private CreditCardPayment cc = new CreditCardPayment();
    private DebitCardPayment dc = new DebitCardPayment();

    public void checkout(String typePayment, double amount) {
        if (typePayment.equals("CC")) {
            cc.processCreditCardPayment(amount);
        } else {
            dc.processDebitCardPayment(amount);
        }
    }
}
