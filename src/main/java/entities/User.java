package entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    //borrowedBooks
    @ManyToMany
    private List<Book> borrowedBooks;
    @OneToMany
    private List<Fine> fines;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
