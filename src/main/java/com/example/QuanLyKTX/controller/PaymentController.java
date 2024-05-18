package com.example.QuanLyKTX.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.QuanLyKTX.entity.Invoice;
import com.example.QuanLyKTX.repository.InvoiceRepository;



@Controller
public class PaymentController {

    private InvoiceRepository invoiceRepository;
    @GetMapping("/user/{id}/payment")
    public String payment(@PathVariable("id") String userId) {
   
        return "payment";
    }

    @GetMapping("/user/{userId}/payment/{invoiceId}")
    public String detailBilling(@PathVariable("userId") String userId, @PathVariable("invoiceId") String invoiceId) {
        return "detail_billing";
    }
}