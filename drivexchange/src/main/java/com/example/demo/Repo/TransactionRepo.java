package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {
    List<Transaction> findByBuyerUserId(Long buyerId);
    List<Transaction> findBySellerUserId(Long sellerId);
}
