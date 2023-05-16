package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class BorrowingTransaction {
    @Id
    @GeneratedValue
    private Long id;
    private Date borrowDate;
    private Date returnDate;
    private boolean isOverdue;
    @ManyToOne
    private User user;
    @ManyToOne
    private Book book;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
