package com.mwu.solidsrp;

public class BookPersistence {
    public void save(Book book) {
        // Code to save the book to a database or file
        System.out.println("Saving book: " + book.getTitle() + " by " + book.getAuthor());
    }
}
