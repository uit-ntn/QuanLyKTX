package com.example.QuanLyKTX.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.QuanLyKTX.model.Invoice;
import com.example.QuanLyKTX.service.InvoiceService;

@Controller
public class InvoiceController {
    private InvoiceService invoiceService = null;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
    
    @GetMapping(value = "/api/invoices", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAlInvoices();
    }
}
