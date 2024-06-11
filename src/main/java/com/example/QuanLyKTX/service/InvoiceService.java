package com.example.QuanLyKTX.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.Invoice;
import com.example.QuanLyKTX.repository.InvoiceRepository;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getInvoicesByStudentID(Long studentID) {
        return invoiceRepository.findByStudent_StudentID(studentID);
    }

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public Invoice findById(Long invoiceId) {
        return invoiceRepository.findById(invoiceId).orElse(null);
    }

    public Long getUnpaidInvoiceCount() {
        return invoiceRepository.countByPaymentStatus("Unpaid");
    }

    public Optional<Invoice> getInvoiceById(Long invoiceID) {
        return invoiceRepository.findById(invoiceID);
    }
}
