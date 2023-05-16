package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    @OneToMany
    private List<Book> books;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
