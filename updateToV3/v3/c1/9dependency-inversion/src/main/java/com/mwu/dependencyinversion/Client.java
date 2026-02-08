package com.mwu.dependencyinversion;



import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book title: ");
        String title = scanner.nextLine();
        System.out.println("Book author: ");
        String author = scanner.nextLine();
        System.out.println("Save book to database? Enter \"T\" for text, or any other value for database. : ");
        String saveTo = scanner.nextLine();
        scanner.close();


        Book book = new Book(title, author);
        BookPersistence bookPersistence = null;
        if (saveTo.equals("T")) {
            bookPersistence = new BookPersistenceImpl(new TextFileSaveFormat());
        } else {
            bookPersistence = new BookPersistenceImpl(new DbSaveFormat());
        }


    }
}
