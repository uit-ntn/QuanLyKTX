package com.example.QuanLyKTX.model;

import java.util.Date;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "CART")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CARTID")
    private Long cartId;

    @ManyToOne
    @JoinColumn(name = "STUDENTID")
    private Student student;

    public Cart() {
    }

    public Cart(Long cartId, Student student, Date createdDate, List<CartItem> cartItems) {
        this.cartId = cartId;
        this.student = student;
        this.createdDate = createdDate;
        this.cartItems = cartItems;
    }

    public Long getCartId() {
        return this.cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<CartItem> getCartItems() {
        return this.cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public Cart cartId(Long cartId) {
        setCartId(cartId);
        return this;
    }

    public Cart student(Student student) {
        setStudent(student);
        return this;
    }

    public Cart createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public Cart cartItems(List<CartItem> cartItems) {
        setCartItems(cartItems);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) o;
        return Objects.equals(cartId, cart.cartId) && Objects.equals(student, cart.student) && Objects.equals(createdDate, cart.createdDate) && Objects.equals(cartItems, cart.cartItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartId, student, createdDate, cartItems);
    }

    @Override
    public String toString() {
        return "{" +
            " cartId='" + getCartId() + "'" +
            ", student='" + getStudent() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", cartItems='" + getCartItems() + "'" +
            "}";
    }

    @Temporal(TemporalType.DATE)
    private Date createdDate = new Date();

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<CartItem> cartItems;

    // Getters and Setters
}
