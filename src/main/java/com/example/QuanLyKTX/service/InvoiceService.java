package com.example.QuanLyKTX.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.Invoice;
import com.example.QuanLyKTX.repository.InvoiceRepository;

@Service
public class InvoiceService {
    
    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getAlInvoices() {
        return invoiceRepository.findAll();
    }
}
