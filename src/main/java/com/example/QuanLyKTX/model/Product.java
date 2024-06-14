package com.example.QuanLyKTX.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRODUCTID")
    private Long productId;

    @Column(name = "PRODUCTNAME")
    private String productName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private Double price;

    public Product() {
    }

    public Product(Long productId, String productName, String description, Double price, Integer stockQuantity, String image) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.image = image;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return this.stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Product productId(Long productId) {
        setProductId(productId);
        return this;
    }

    public Product productName(String productName) {
        setProductName(productName);
        return this;
    }

    public Product description(String description) {
        setDescription(description);
        return this;
    }

    public Product price(Double price) {
        setPrice(price);
        return this;
    }

    public Product stockQuantity(Integer stockQuantity) {
        setStockQuantity(stockQuantity);
        return this;
    }

    public Product image(String image) {
        setImage(image);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) && Objects.equals(productName, product.productName) && Objects.equals(description, product.description) && Objects.equals(price, product.price) && Objects.equals(stockQuantity, product.stockQuantity) && Objects.equals(image, product.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, description, price, stockQuantity, image);
    }

    @Override
    public String toString() {
        return "{" +
            " productId='" + getProductId() + "'" +
            ", productName='" + getProductName() + "'" +
            ", description='" + getDescription() + "'" +
            ", price='" + getPrice() + "'" +
            ", stockQuantity='" + getStockQuantity() + "'" +
            ", image='" + getImage() + "'" +
            "}";
    }
    private Integer stockQuantity;
    private String image;

    // Getters and Setters
}
