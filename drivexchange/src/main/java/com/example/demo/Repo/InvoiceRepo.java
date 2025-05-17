package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Invoice;

public interface InvoiceRepo extends JpaRepository<Invoice, Long> {
    Invoice findByTransactionTransactionId(Long transactionId);
}
