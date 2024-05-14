package com.example.quanlykytucxa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaRepositories("com.example.quanlykytucxa.repository")
@EntityScan(basePackages = "com.example.quanlykytucxa.entity")
@RestController
public class QuanLyKyTucXaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuanLyKyTucXaApplication.class, args);
		System.out.println("Hello Spring");
	}

}
