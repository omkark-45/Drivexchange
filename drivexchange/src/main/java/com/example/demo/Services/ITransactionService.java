package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.Transaction;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);
    List<Transaction> getTransactionsByBuyer(Long buyerId);
    List<Transaction> getTransactionsBySeller(Long sellerId);
    Transaction getTransactionById(Long id);
}
