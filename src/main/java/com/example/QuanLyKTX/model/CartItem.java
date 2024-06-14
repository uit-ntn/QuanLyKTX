package com.example.QuanLyKTX.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name="CARTITEM")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CARTITEMID")
    private Long cartItemId;

    @ManyToOne
    @JoinColumn(name = "CARTID")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "PRODUCTID")
    private Product product;
    @Column(name = "QUANTITY")
    private Integer quantity;

    public CartItem() {
    }

    public CartItem(Long cartItemId, Cart cart, Product product, Integer quantity) {
        this.cartItemId = cartItemId;
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
    }

    public Long getCartItemId() {
        return this.cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
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

    public CartItem cartItemId(Long cartItemId) {
        setCartItemId(cartItemId);
        return this;
    }

    public CartItem cart(Cart cart) {
        setCart(cart);
        return this;
    }

    public CartItem product(Product product) {
        setProduct(product);
        return this;
    }

    public CartItem quantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CartItem)) {
            return false;
        }
        CartItem cartItem = (CartItem) o;
        return Objects.equals(cartItemId, cartItem.cartItemId) && Objects.equals(cart, cartItem.cart) && Objects.equals(product, cartItem.product) && Objects.equals(quantity, cartItem.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartItemId, cart, product, quantity);
    }

    @Override
    public String toString() {
        return "{" +
            " cartItemId='" + getCartItemId() + "'" +
            ", cart='" + getCart() + "'" +
            ", product='" + getProduct() + "'" +
            ", quantity='" + getQuantity() + "'" +
            "}";
    }

    // Getters and Setters
}
