package com.example.QuanLyKTX.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.QuanLyKTX.model.CartItem;
import com.example.QuanLyKTX.model.Product;
import com.example.QuanLyKTX.service.CartService;
import com.example.QuanLyKTX.service.ProductService;

@Controller
public class CartController {

    private final CartService cartService;
    private final ProductService productService;

    @Autowired
    public CartController(CartService cartService, ProductService productService) {
        this.cartService = cartService;
        this.productService = productService;
    }

    @GetMapping("/shop/cart/{studentID}")
    public String getCartItems(@PathVariable Long studentID, Model model) {
        List<CartItem> cartItems = cartService.getCartItemsByStudentId(studentID);
        model.addAttribute("cartItems", cartItems);

        List<Product> products = cartItems.stream()
                .map(cartItem -> productService.getProductById(cartItem.getProductId()))
                .collect(Collectors.toList());
        model.addAttribute("products", products);

        return "cart";
    }
}
