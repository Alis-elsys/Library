package entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @ManyToOne
    private Author author;
    private String isbn;
    private String genre;
    @ManyToOne
    private Publisher publisher;
    private int year;
    private boolean isAvailable;
    private int numberOfCopies;
    @ManyToMany
    private List<User> borrowers;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
