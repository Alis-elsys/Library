package com.example.demo.services.implementation;

import com.example.demo.entities.Author;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImp implements AuthorService {
    private final AuthorRepository authorRepository;
    @Override
    public List<Author> AllAuthors() { return authorRepository.findAll(); }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author update(Author author) {
        Author authorTemp = authorRepository.findById(author.getId()).orElse(null);
        if (authorTemp != null) {
            authorTemp.setName(author.getName());
            authorTemp.setBooks(author.getBooks());
            return authorRepository.save(authorTemp);
        }
        authorRepository.save(author);
        return author;
    }

    @Override
    public void deleteById(Long id) { authorRepository.deleteById(id); }

    @Override
    public Author findById(Long id) { return authorRepository.findById(id).orElse(null); }
}
