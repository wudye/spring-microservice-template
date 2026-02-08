package com.mwu.openclosed;

public class BookPersistence {

    private BookSaveFormat bookSaveFormat;

    public BookPersistence(BookSaveFormat bookSaveFormat) {
        this.bookSaveFormat = bookSaveFormat;
    }
    public void save(Book book) {
        bookSaveFormat.save(book);
    }
}
