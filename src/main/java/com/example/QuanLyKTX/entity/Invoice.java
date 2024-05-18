package com.example.QuanLyKTX.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InvoiceID")
    private Long invoiceID;

    @Column(name = "StudentID")
    private Long studentID;

    @Column(name = "RoomID")
    private Long roomID;

    @Column(name = "IssueDate")
    private Date issueDate;

    @Column(name = "DueDate")
    private Date dueDate;

    @Column(name = "RoomCost")
    private double roomCost;

    @Column(name = "ElectricityUsage")
    private double electricityUsage;

    @Column(name = "WaterUsage")
    private double waterUsage;

    @Column(name = "ElectricityCost")
    private double electricityCost;

    @Column(name = "WaterCost")
    private double waterCost;

    @Column(name = "JunkCost")
    private double junkCost;

    @Column(name = "TotalAmount")
    private double totalAmount;

    @Column(name = "PaidAmount")
    private double paidAmount;

    @Column(name = "RemainingAmount")
    private double remainingAmount;

    @Column(name = "PaymentStatus")
    private String paymentStatus;

    public Invoice() {
    }

    // Getters and setters

    public Long getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(Long invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public Long getRoomID() {
        return roomID;
    }

    public void setRoomID(Long roomID) {
        this.roomID = roomID;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getRoomCost() {
        return roomCost;
    }

    public void setRoomCost(double roomCost) {
        this.roomCost = roomCost;
    }

    public double getElectricityUsage() {
        return electricityUsage;
    }

    public void setElectricityUsage(double electricityUsage) {
        this.electricityUsage = electricityUsage;
    }

    public double getWaterUsage() {
        return waterUsage;
    }

    public void setWaterUsage(double waterUsage) {
        this.waterUsage = waterUsage;
    }

    public double getElectricityCost() {
        return electricityCost;
    }

    public void setElectricityCost(double electricityCost) {
        this.electricityCost = electricityCost;
    }

    public double getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(double waterCost) {
        this.waterCost = waterCost;
    }

    public double getJunkCost() {
        return junkCost;
    }

    public void setJunkCost(double junkCost) {
        this.junkCost = junkCost;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceID=" + invoiceID +
                ", studentID=" + studentID +
                ", roomID=" + roomID +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", roomCost=" + roomCost +
                ", electricityUsage=" + electricityUsage +
                ", waterUsage=" + waterUsage +
                ", electricityCost=" + electricityCost +
                ", waterCost=" + waterCost +
                ", junkCost=" + junkCost +
                ", totalAmount=" + totalAmount +
                ", paidAmount=" + paidAmount +
                ", remainingAmount=" + remainingAmount +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}

