package com.example.demo.services.implementation;

import com.example.demo.entities.BorrowingTransaction;
import com.example.demo.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.services.TransacionService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImp implements TransacionService {
    private final TransactionRepository transactionRepository;
    @Override
    public List<BorrowingTransaction> AllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public BorrowingTransaction save(BorrowingTransaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public BorrowingTransaction update(BorrowingTransaction transaction) {
        BorrowingTransaction borrowingTransaction = transactionRepository.findById(transaction.getId()).orElse(null);
        if (borrowingTransaction != null) {
            borrowingTransaction.setBook(transaction.getBook());
            borrowingTransaction.setUser(transaction.getUser());
            borrowingTransaction.setBorrowDate(transaction.getBorrowDate());
            borrowingTransaction.setReturnDate(transaction.getReturnDate());
            borrowingTransaction.setOverdue(transaction.isOverdue());
            return transactionRepository.save(borrowingTransaction);
        }
        transactionRepository.save(transaction);
        return transaction;
    }

    @Override
    public void deleteById(Long id) {
        transactionRepository.deleteById(id);
    }

    @Override
    public BorrowingTransaction findById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }
}
