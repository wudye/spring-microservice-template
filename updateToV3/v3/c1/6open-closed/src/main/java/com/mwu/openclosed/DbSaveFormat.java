package com.mwu.openclosed;

public class DbSaveFormat implements BookSaveFormat{
    @Override
    public void save(Book book) {
        System.out.println("Saving book to database: " + book.getTitle() + " by " + book.getAuthor());
    }
}
