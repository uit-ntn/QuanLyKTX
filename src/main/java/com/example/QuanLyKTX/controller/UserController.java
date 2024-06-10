package com.example.QuanLyKTX.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.QuanLyKTX.service.InvoiceService;
import com.example.QuanLyKTX.service.RepairService;
import com.example.QuanLyKTX.service.UserService;
import com.example.QuanLyKTX.model.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    private final UserService userService;

    private InvoiceService invoiceService;

    private RepairService repairService;

    public UserController(UserService userService, InvoiceService invoiceService, RepairService repairService) {
        this.userService = userService;
        this.invoiceService = invoiceService;
        this.repairService = repairService;
    }

    @GetMapping("/user/profile")
    public String profile(Model model) {
        User user = userService.getLoggedInUser();
        if (user != null && !"admin".equals(user.getRole())) {
            Student student = userService.getStudentByUser(user);
            List<Invoice> invoices = invoiceService.getInvoicesByStudentID(student.getStudentID());
            List<RepairRequest> repairRequests = repairService.getRepairRequestsByStudentID(student.getStudentID());
            model.addAttribute("invoices", invoices);
            model.addAttribute("user", user);
            model.addAttribute("student", student);
            model.addAttribute("repairRequests", repairRequests);
            System.out.println(user);
            System.out.println(student);
            System.out.println(repairRequests);
        }
        return "user";
    }

    @GetMapping("/user/repair")
    public String showRepair(Model model) {
        User user = userService.getLoggedInUser();
        if (user != null && !"admin".equals(user.getRole())) {
            Student student = userService.getStudentByUser(user);
            List<Invoice> invoices = invoiceService.getInvoicesByStudentID(student.getStudentID());
            List<RepairRequest> repairRequests = repairService.getRepairRequestsByStudentID(student.getStudentID());
            model.addAttribute("invoices", invoices);
            model.addAttribute("user", user);
            model.addAttribute("student", student);
            model.addAttribute("repairRequests", repairRequests);
            System.out.println(user);
            System.out.println(student);
            System.out.println(repairRequests);
        }
        return "user-repair";
    }


    @GetMapping("/user/invoices")
    public String showInvoice(Model model) {
        User user = userService.getLoggedInUser();
        if (user != null && !"admin".equals(user.getRole())) {
            Student student = userService.getStudentByUser(user);
            List<Invoice> invoices = invoiceService.getInvoicesByStudentID(student.getStudentID());
            List<RepairRequest> repairRequests = repairService.getRepairRequestsByStudentID(student.getStudentID());
            model.addAttribute("invoices", invoices);
            model.addAttribute("user", user);
            model.addAttribute("student", student);
            model.addAttribute("repairRequests", repairRequests);
            System.out.println(user);
            System.out.println(student);
            System.out.println(invoices);
            System.out.println(repairRequests);
        }
        return "user-invoices";
    }

    @PostMapping("/user/repair-request")
    public ResponseEntity<String> submitRepairRequest(
            @RequestParam String description,
            @RequestParam Long studentID,
            // @RequestParam Long roomID,
            Model model) {

        System.out.println("studentID: " + studentID + ", description: " + description);

        RepairRequest repairRequest = new RepairRequest();
        repairRequest.setStudentID(studentID);
        // repairRequest.setRoomID(roomID);
        repairRequest.setDescription(description);

        // Đặt ngày hiện tại với định dạng tùy chỉnh
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date currentDate = dateFormat.parse(dateFormat.format(new Date()));
            repairRequest.setRequestDate(currentDate);
        } catch (ParseException e) {
            e.printStackTrace(); // Xử lý ngoại lệ nếu có
        }

        repairRequest.setStatus("pending");
        repairService.saveRepairRequest(repairRequest);

        model.addAttribute("message", "Gửi yêu cầu thành công!");
        return ResponseEntity.ok("Đăng ký thành công!");
    }
}
