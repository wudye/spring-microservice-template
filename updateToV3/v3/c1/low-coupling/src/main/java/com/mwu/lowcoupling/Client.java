package com.mwu.lowcoupling;

import java.util.Scanner;

public class Client {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amout: ");
        String amount = scanner.nextLine().replace(",", ".");
        System.out.print("Credit or Debit? Enter \"CC\" for credit, or any other value for debit. : ");
        String typePayment = scanner.nextLine();
        scanner.close();

        ShopinngCart shopinngCart = new ShopinngCart(getTypeOfPayment(typePayment));
        shopinngCart.checkout(Double.parseDouble(amount));
    }

    private static Payment getTypeOfPayment(String typePayment) {

        return  switch (typePayment) {
            case "CC" -> new CreditCardPayment();
            case "DC" -> new DebitCardPayment();
            default -> new BankTransferPayment();
        };
    }
}
