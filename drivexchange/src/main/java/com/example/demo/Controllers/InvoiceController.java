package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Invoice;
import com.example.demo.Services.IInvoiceService;

@RestController
@RequestMapping("/api/invoices")
@CrossOrigin("*")
public class InvoiceController {

    @Autowired
    private IInvoiceService invoiceService;

    @PostMapping
    public Invoice generateInvoice(@RequestBody Invoice invoice) {
        return invoiceService.generateInvoice(invoice);
    }

    @GetMapping("/transaction/{transactionId}")
    public Invoice getByTransaction(@PathVariable Long transactionId) {
        return invoiceService.getInvoiceByTransactionId(transactionId);
    }
}
