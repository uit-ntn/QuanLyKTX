package com.example.QuanLyKTX.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="ORDERPAYMENT")
public class OrderPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PAYMENTID")
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "ORDERID")
    private Order order;

    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @Column(name="AMOUNT")
    private Double amount;
    

    public OrderPayment() {
    }

    public OrderPayment(Long paymentId, Order order, Date paymentDate, Double amount) {
        this.paymentId = paymentId;
        this.order = order;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public Long getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public OrderPayment paymentId(Long paymentId) {
        setPaymentId(paymentId);
        return this;
    }

    public OrderPayment order(Order order) {
        setOrder(order);
        return this;
    }

    public OrderPayment paymentDate(Date paymentDate) {
        setPaymentDate(paymentDate);
        return this;
    }

    public OrderPayment amount(Double amount) {
        setAmount(amount);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OrderPayment)) {
            return false;
        }
        OrderPayment orderPayment = (OrderPayment) o;
        return Objects.equals(paymentId, orderPayment.paymentId) && Objects.equals(order, orderPayment.order) && Objects.equals(paymentDate, orderPayment.paymentDate) && Objects.equals(amount, orderPayment.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, order, paymentDate, amount);
    }

    @Override
    public String toString() {
        return "{" +
            " paymentId='" + getPaymentId() + "'" +
            ", order='" + getOrder() + "'" +
            ", paymentDate='" + getPaymentDate() + "'" +
            ", amount='" + getAmount() + "'" +
            "}";
    }

}
