package com.example.QuanLyKTX.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="ORDER")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDERID")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "STUDENTID")
    private Student student;

    @Temporal(TemporalType.DATE)
    @Column(name = "ORDERDATE")
    private Date orderDate;

    @Column(name = "TOTALAMOUNT")
    private Double totalAmount;

    @Column(name = "STATUS")
    private String status;

    // Getters and Setters

    public Order() {
    }

    public Order(Long orderId, Student student, Date orderDate, Double totalAmount, String status) {
        this.orderId = orderId;
        this.student = student;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order orderId(Long orderId) {
        setOrderId(orderId);
        return this;
    }

    public Order student(Student student) {
        setStudent(student);
        return this;
    }

    public Order orderDate(Date orderDate) {
        setOrderDate(orderDate);
        return this;
    }

    public Order totalAmount(Double totalAmount) {
        setTotalAmount(totalAmount);
        return this;
    }

    public Order status(String status) {
        setStatus(status);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(student, order.student) && Objects.equals(orderDate, order.orderDate) && Objects.equals(totalAmount, order.totalAmount) && Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, student, orderDate, totalAmount, status);
    }

    @Override
    public String toString() {
        return "{" +
            " orderId='" + getOrderId() + "'" +
            ", student='" + getStudent() + "'" +
            ", orderDate='" + getOrderDate() + "'" +
            ", totalAmount='" + getTotalAmount() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
    
}
