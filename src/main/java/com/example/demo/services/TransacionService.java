package com.example.demo.services;

import com.example.demo.entities.BorrowingTransaction;
import java.util.List;

public interface TransacionService {
    List<BorrowingTransaction> AllTransactions();
    BorrowingTransaction findById(Long id);
    BorrowingTransaction save(BorrowingTransaction transaction);
    BorrowingTransaction update(BorrowingTransaction transaction);
    void deleteById(Long id);
}
