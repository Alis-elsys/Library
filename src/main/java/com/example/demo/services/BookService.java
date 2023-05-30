package com.example.demo.services;

import com.example.demo.entities.Book;
import java.util.List;


public interface BookService {
    List<Book> AllBooks();
    Book findById(Long id);
    Book save(Book book);
    Book update(Book book);
    void deleteById(Long id);
}
