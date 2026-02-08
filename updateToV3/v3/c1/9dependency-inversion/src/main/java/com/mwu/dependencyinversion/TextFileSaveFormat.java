package com.mwu.dependencyinversion;


public class TextFileSaveFormat implements BookSaveFormat {
    @Override
    public void save(Book book) {
        System.out.println("Saving book in text format: " + book.getTitle() + " by " + book.getAuthor());
    }
}
