package com.example.QuanLyKTX.service;

import com.example.QuanLyKTX.model.Cart;
import com.example.QuanLyKTX.model.CartItem;
import com.example.QuanLyKTX.repository.CartItemRepository;
import com.example.QuanLyKTX.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    @Autowired
    public CartService(CartRepository cartRepository, CartItemRepository cartItemRepository) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
    }

    public List<CartItem> getCartItemsByStudentId(Long studentID) {
        Cart cart = cartRepository.findByStudentID(studentID);
        return cart != null ? cartItemRepository.findByCartId(cart.getCartId()) : new ArrayList<>();
    }

    public void saveCartItem(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

    public Cart getCartByStudentId(Long studentId) {
        return cartRepository.findByStudentID(studentId);
    }

    public Cart saveOrUpdateCart(Cart cart) {

        if (cart.getCartId() == null) {
            // Logic tạo Cart ID, giả sử bạn có một phương thức để tạo ID mới
            cart.setCartId(generateNewCartId());
        }
        return cartRepository.save(cart);
    }

    // Phương thức generateNewCartId
    private Long generateNewCartId() {
        // Logic để tạo ID mới, ví dụ sử dụng một sequence trong cơ sở dữ liệu
        return cartRepository.getNextCartId();
    }

}
