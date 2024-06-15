package com.example.QuanLyKTX.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.QuanLyKTX.model.Cart;
import com.example.QuanLyKTX.model.CartItem;
import com.example.QuanLyKTX.model.Product;
import com.example.QuanLyKTX.model.SessionManager;
import com.example.QuanLyKTX.model.User;
import com.example.QuanLyKTX.service.CartItemService;
import com.example.QuanLyKTX.service.CartService;
import com.example.QuanLyKTX.service.ProductService;

import jakarta.websocket.server.PathParam;

@Controller
public class ShopController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    public ShopController(ProductService productService, CartService cartService, CartItemService cartItemService) {
        this.productService = productService;
        this.cartService = cartService;
        this.cartItemService = cartItemService;
    }

    @Autowired 
    private CartItemService cartItemService;

    @GetMapping("/shop")
    public String showProductList(Model model) {
        List<Product> products = productService.getAllProducts();
        User loggedUser = SessionManager.getLoggedInUser();
        model.addAttribute("products", products);
        model.addAttribute("loggedUser", loggedUser);
        return "shop";
    }

    @GetMapping("/shop/order")
    public String getMethodName() {
        return "order";
    }

    @GetMapping("/shop/search")
    public String getMethodName2() {
        return "product-search";
    }
    @PostMapping("/shop/add-to-cart")
    public ResponseEntity<String> addToCart(@RequestParam Long productId) {
        // Lấy thông tin user đã đăng nhập
        User loggedUser = SessionManager.getLoggedInUser();
        if (loggedUser == null) {
            return ResponseEntity.badRequest().body("Bạn cần đăng nhập để thêm sản phẩm vào giỏ hàng");
        }
    
        // Lấy cart của user (nếu chưa có sẽ tạo mới)
        Cart cart = cartService.getCartByStudentId(loggedUser.getStudentID());
        if (cart == null) {
            // Nếu chưa có giỏ hàng, tạo mới
            cart = new Cart();
            cart.setStudentID(loggedUser.getStudentID());
            cart = cartService.saveOrUpdateCart(cart); // Đảm bảo phương thức này xử lý logic của trigger
        }
    
        // Kiểm tra xem sản phẩm có tồn tại trong DB không
        Product product = productService.getProductById(productId);
        if (product == null) {
            return ResponseEntity.badRequest().body("Sản phẩm không tồn tại");
        }
    
        // Kiểm tra xem sản phẩm đã có trong giỏ hàng chưa
        CartItem existingCartItem = cartItemService.findByCartIdAndProductId(cart.getCartId(), productId);
        if (existingCartItem != null) {
            // Nếu đã có, tăng số lượng lên 1
            existingCartItem.setQuantity(existingCartItem.getQuantity() + 1);
            cartItemService.saveOrUpdateCartItem(existingCartItem);
        } else {
            // Nếu chưa có, tạo mới CartItem và thêm vào giỏ hàng
            CartItem newCartItem = new CartItem();
            newCartItem.setCartId(cart.getCartId());
            newCartItem.setProductId(productId);
            newCartItem.setQuantity(1); // Mặc định số lượng là 1
            cartItemService.saveOrUpdateCartItem(newCartItem);
        }
    
        return ResponseEntity.ok("Sản phẩm đã được thêm vào giỏ hàng thành công");
    }
    

}
