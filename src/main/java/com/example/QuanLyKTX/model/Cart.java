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

        @Column(name = "STUDENTID")
        private Long studentID;


    public Cart() {
    }

    public Cart(Long cartId, Long studentID) {
        this.cartId = cartId;
        this.studentID = studentID;
    }

    public Long getCartId() {
        return this.cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getStudentID() {
        return this.studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public Cart cartId(Long cartId) {
        setCartId(cartId);
        return this;
    }

    public Cart studentID(Long studentID) {
        setStudentID(studentID);
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
        return Objects.equals(cartId, cart.cartId) && Objects.equals(studentID, cart.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartId, studentID);
    }

    @Override
    public String toString() {
        return "{" +
            " cartId='" + getCartId() + "'" +
            ", studentID='" + getStudentID() + "'" +
            "}";
    }
   
}
