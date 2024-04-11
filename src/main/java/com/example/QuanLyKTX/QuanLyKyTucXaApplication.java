package com.example.QuanLyKTX;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan("com.example.QuanLyKTX.model")
@RestController
public class QuanLyKyTucXaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuanLyKyTucXaApplication.class, args);
		System.out.println("Hello Spring");
	}

}
