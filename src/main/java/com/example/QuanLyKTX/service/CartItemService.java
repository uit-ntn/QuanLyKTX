package com.example.QuanLyKTX.service;

import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.CartItem;
import com.example.QuanLyKTX.repository.CartItemRepository;

@Service
public class CartItemService {
    private CartItemRepository cartItemRepository;

    public CartItemService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }



    public CartItem findByCartIdAndProductId(Long cartId, Long productId) {
        return cartItemRepository.findByCartIdAndProductId(cartId, productId);
    }

    public CartItem saveOrUpdateCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

}
