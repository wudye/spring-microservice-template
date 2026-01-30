package com.mwu.microservicedemo.repository;

import com.mwu.microservicedemo.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository userRepository;

    @Test
    public void testBookRepository() {

        Book book = new Book();
        book.setTitle("Test Title");
        book.setAuthor("Test Author");
        book.setIsbn("1234567890");
        userRepository.save(book);

        List<Book> books = userRepository.findAll();
        assert(books.size() == 1);
        assertEquals("Test Title", books.get(0).getTitle());
        // Add your test cases here
    }

}
