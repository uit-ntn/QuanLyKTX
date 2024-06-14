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

    @ManyToOne
    @JoinColumn(name = "ORDERID")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "PRODUCTID")
    private Product product;

    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "PRICE")
    private Double price;
    

    public OrderDetail() {
    }

    public OrderDetail(Long orderDetailId, Order order, Product product, Integer quantity, Double price) {
        this.orderDetailId = orderDetailId;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getOrderDetailId() {
        return this.orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    public OrderDetail order(Order order) {
        setOrder(order);
        return this;
    }

    public OrderDetail product(Product product) {
        setProduct(product);
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
        return Objects.equals(orderDetailId, orderDetail.orderDetailId) && Objects.equals(order, orderDetail.order) && Objects.equals(product, orderDetail.product) && Objects.equals(quantity, orderDetail.quantity) && Objects.equals(price, orderDetail.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDetailId, order, product, quantity, price);
    }

    @Override
    public String toString() {
        return "{" +
            " orderDetailId='" + getOrderDetailId() + "'" +
            ", order='" + getOrder() + "'" +
            ", product='" + getProduct() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

}
