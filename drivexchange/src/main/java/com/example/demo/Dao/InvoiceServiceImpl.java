package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Invoice;
import com.example.demo.Repo.InvoiceRepo;
import com.example.demo.Services.IInvoiceService;

@Service
public class InvoiceServiceImpl implements IInvoiceService {

    @Autowired
    private InvoiceRepo invoiceRepository;

    @Override
    public Invoice generateInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice getInvoiceByTransactionId(Long transactionId) {
        return invoiceRepository.findByTransactionTransactionId(transactionId);
    }
}
