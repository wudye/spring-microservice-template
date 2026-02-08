package com.mwu.dependencyinversion;

import com.mwu.openclosed.BookSaveFormat;

public interface BookPersistence {
    void saveBook(Book book);

}
