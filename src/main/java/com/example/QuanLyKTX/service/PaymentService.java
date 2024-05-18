package com.example.QuanLyKTX.service;

import java.time.LocalDate;
import java.util.Date;

import javax.swing.text.DateFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.QuanLyKTX.entity.Invoice;
import com.example.QuanLyKTX.entity.Payment;
import com.example.QuanLyKTX.repository.InvoiceRepository;
import com.example.QuanLyKTX.repository.PaymentRepository;

@Service
public class PaymentService {

    private InvoiceRepository invoiceRepository;
    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(InvoiceRepository invoiceRepository, PaymentRepository paymentRepository) {
        this.invoiceRepository = invoiceRepository;
        this.paymentRepository = paymentRepository;
    }

    public void invoicePayment(Long invoiceId) {
     

        // tìm và xử lý hóa đơn đã thanh toán

        // tìm dòng dữ liệu có hóa đơn có id là invoiceId, nếu có thì gán cho biến invoice, nếu không có gán null 
        Invoice invoice = invoiceRepository.findById(invoiceId).orElse(null);
   
        

        // Tạo đối tượng Payment giống tạo 1 dòng dữ liệu trong database
        Payment payment = new Payment();


        //thêm data vào table payment
        // sử hàm setter trong entity payment
        payment.setInvoiceID(invoiceId);
        payment.setStudentID(invoice.getStudentID());
        
        
        // lấy ngày thanh toán hôm nay
        LocalDate localDate;
        localDate = LocalDate.now();
        payment.setPaymentDate(localDate);

        
        // Lưu thông tin thanh toán vào cơ sở dữ liệu sử dụng hàm có sẵn trong spring data jpa
        paymentRepository.save(payment);
        
        // Cập nhật trạng thái bằng setter thanh toán của hóa đơn thành "Đã thanh toán"
        invoice.setPaymentStatus("Đã thanh toán");

        // hàm save trong spring data jpa
        invoiceRepository.save(invoice);
    }
}
