package com.example.QuanLyKTX.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/static/css/**")
                .addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/resources/static/js/**")
                .addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/resources/static/img/**")
                .addResourceLocations("classpath:/static/img/");
    }
}
