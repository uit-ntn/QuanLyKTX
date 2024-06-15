package com.example.QuanLyKTX.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name="CARTITEMS")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CARTITEMID")
    private Long cartItemId;

    @Column(name = "CARTID")
    private Long cartId;

    @Column(name = "PRODUCTID")
    private Long productId;
    @Column(name = "QUANTITY")
    private Integer quantity;

    public CartItem() {
    }


    public CartItem(Long cartItemId, Long cartId, Long productId, Integer quantity) {
        this.cartItemId = cartItemId;
        this.cartId = cartId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getCartItemId() {
        return this.cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Long getCartId() {
        return this.cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
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

    public CartItem cartItemId(Long cartItemId) {
        setCartItemId(cartItemId);
        return this;
    }

    public CartItem cartId(Long cartId) {
        setCartId(cartId);
        return this;
    }

    public CartItem productId(Long productId) {
        setProductId(productId);
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
        return Objects.equals(cartItemId, cartItem.cartItemId) && Objects.equals(cartId, cartItem.cartId) && Objects.equals(productId, cartItem.productId) && Objects.equals(quantity, cartItem.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartItemId, cartId, productId, quantity);
    }

    @Override
    public String toString() {
        return "{" +
            " cartItemId='" + getCartItemId() + "'" +
            ", cartId='" + getCartId() + "'" +
            ", productId='" + getProductId() + "'" +
            ", quantity='" + getQuantity() + "'" +
            "}";
    }

}
