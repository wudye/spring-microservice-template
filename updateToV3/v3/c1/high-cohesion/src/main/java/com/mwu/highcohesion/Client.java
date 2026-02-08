package com.mwu.highcohesion;


import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A add User name: ");
        System.out.println("U update user name: ");
        System.out.println("V validate email: ");
        System.out.println("S send email: ");

        execute(scanner.nextLine());
        scanner.close();
    }

    private static void execute(String s) {
        switch (s) {
            case "A" -> new UserMapper().addUser(new User(1L, "SupperUser", "supperuser@gmail.com"));
            case "U" -> new UserMapper().updateUser(new User(1L, "SupperUser", "supperuser@gmail.com"));
            case "V" -> new EmailManager().validateEmail(new User(1L, "SupperUser", "supperuser@gmail.com"));
            case "S" -> new EmailManager().sendEmail(new User(1L, "SupperUser", "supperuser@gmail.com"));
            default -> System.out.println("Invalid option");
        }
    }
}
