package com.example.demo.services;

import com.example.demo.entities.Author;
import java.util.List;


public interface AuthorService {
    List<Author> AllAuthors();

    Author findById(Long id);

    Author save(Author author);

    Author update(Author author);

    void deleteById(Long id);
}
