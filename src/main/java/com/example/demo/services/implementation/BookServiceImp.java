package com.example.demo.services.implementation;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.services.BookService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImp implements BookService {
    private final BookRepository bookRepository;

    @Override
    public List<Book> AllBooks() { return bookRepository.findAll(); }

    @Override
    public Book save(Book book) {
    return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        Book bookTemp = bookRepository.findById(book.getId()).orElse(null);
        if (bookTemp != null) {
            bookTemp.setTitle(book.getTitle());
            bookTemp.setAuthor(book.getAuthor());
            bookTemp.setPublisher(book.getPublisher());
            bookTemp.setGenre(book.getGenre());
            bookTemp.setYear(book.getYear());
            bookTemp.setAvailable(book.isAvailable());
            return bookRepository.save(bookTemp);
        }
        bookRepository.save(book);
        return book;
    }

    @Override
    public void deleteById(Long id) { bookRepository.deleteById(id); }

    @Override
    public Book findById(Long id) {
    return bookRepository.findById(id).orElse(null);
    }
}