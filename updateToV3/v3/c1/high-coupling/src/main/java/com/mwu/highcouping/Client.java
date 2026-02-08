package com.mwu.highcouping;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Amout: ");
        String amount = scanner.nextLine().replace(",", ".");
        System.out.print("Credit or Debit? Enter \"CC\" for credit, or any other value for debit. : ");
        String typePayment = scanner.nextLine();
        scanner.close();

        ShopinngCart shopinngCart = new ShopinngCart();
        shopinngCart.checkout(typePayment, Double.parseDouble(amount));

    }
}
