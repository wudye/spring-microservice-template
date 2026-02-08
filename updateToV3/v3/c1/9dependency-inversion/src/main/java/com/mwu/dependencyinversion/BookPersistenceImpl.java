package com.mwu.dependencyinversion;

public class BookPersistenceImpl implements BookPersistence{
    private BookSaveFormat bookSaveFormat;

    public BookPersistenceImpl(BookSaveFormat bookSaveFormat) {
        this.bookSaveFormat = bookSaveFormat;
    }
    @Override
    public void saveBook(Book book) {
        bookSaveFormat.save(book);

    }
}
