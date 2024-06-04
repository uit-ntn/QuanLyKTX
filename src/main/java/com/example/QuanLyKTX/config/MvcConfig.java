package com.example.QuanLyKTX.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/static/css/**")
                .addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/resources/static/js/**")
                .addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/resources/static/img/**")
                .addResourceLocations("classpath:/static/img/");
    }

//     @Override
//     public void addInterceptors(InterceptorRegistry registry) {
//         registry.addInterceptor(loginInterceptor)
//                 // .addPathPatterns("/**") // Kiểm tra tất cả các request
//                 .excludePathPatterns("/login", "/register", "/error", "/access-denied","/"); // Loại trừ các trang không cần đăng nhập
//     }
}
