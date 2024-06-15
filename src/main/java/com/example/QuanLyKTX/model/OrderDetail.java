package com.example.QuanLyKTX.model;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name="ORDERDETAIL")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDERDETAILID")
    private Long orderDetailId;

    @Column(name = "ORDERID")
    private Long orderId;

    @Column(name = "PRODUCTID")
    private Long productId;

    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "PRICE")
    private Double price;
    

    public OrderDetail() {
    }


    public OrderDetail(Long orderDetailId, Long orderId, Long productId, Integer quantity, Double price) {
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getOrderDetailId() {
        return this.orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderDetail orderDetailId(Long orderDetailId) {
        setOrderDetailId(orderDetailId);
        return this;
    }

    public OrderDetail orderId(Long orderId) {
        setOrderId(orderId);
        return this;
    }

    public OrderDetail productId(Long productId) {
        setProductId(productId);
        return this;
    }

    public OrderDetail quantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    public OrderDetail price(Double price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OrderDetail)) {
            return false;
        }
        OrderDetail orderDetail = (OrderDetail) o;
        return Objects.equals(orderDetailId, orderDetail.orderDetailId) && Objects.equals(orderId, orderDetail.orderId) && Objects.equals(productId, orderDetail.productId) && Objects.equals(quantity, orderDetail.quantity) && Objects.equals(price, orderDetail.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDetailId, orderId, productId, quantity, price);
    }

    @Override
    public String toString() {
        return "{" +
            " orderDetailId='" + getOrderDetailId() + "'" +
            ", orderId='" + getOrderId() + "'" +
            ", productId='" + getProductId() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }
  

}
