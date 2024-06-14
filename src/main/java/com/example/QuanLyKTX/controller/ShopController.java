package com.example.QuanLyKTX.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.QuanLyKTX.model.Product;
import com.example.QuanLyKTX.service.ProductService;

import jakarta.websocket.server.PathParam;

@Controller
public class ShopController {

     @Autowired
    private ProductService productService;


    @GetMapping("/shop")
    public String showProductList(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "shop";
    }

    @GetMapping("/shop/{studentID}/cart")
    public String showCart() {
        return "cart";
    }

    @GetMapping("/shop/product/{product_id}")
    public String showProductDetail() {
        return "product-detail";
    }

    @GetMapping("/shop/order")
    public String getMethodName() {
        return "order";
    }


    @GetMapping("/shop/search")
    public String getMethodName2() {
        return "product-search";
    }

}
