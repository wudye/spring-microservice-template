package com.mwu.liskov;

public class Application {

    public static void main(String[] args) {
        Book book = new Book("The Pragmatic Programmer", "<NAME>");
        Ebook ebook = new Ebook("The Pragmatic Programmer", "<NAME>", "https://www.amazon.com/Pragmatic-Programmer-Journeyman-Master/dp/020161622X");
        displayBookInfo(book);
        displayBookInfo(ebook);
    }

    private static void displayBookInfo(Book book) {
        if (book instanceof Ebook) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Download URL: " + ((Ebook) book).getDownloadLink());
        } else {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
        }

    }
}
