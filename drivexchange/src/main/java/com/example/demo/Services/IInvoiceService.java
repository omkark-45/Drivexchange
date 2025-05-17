package com.example.demo.Services;

import com.example.demo.Model.Invoice;

public interface IInvoiceService {
    Invoice generateInvoice(Invoice invoice);
    Invoice getInvoiceByTransactionId(Long transactionId);
}