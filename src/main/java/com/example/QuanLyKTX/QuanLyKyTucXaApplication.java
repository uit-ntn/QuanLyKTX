// package com.example.QuanLyKTX;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.jdbc.core.BeanPropertyRowMapper;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.QuanLyKTX.model.entity.User;

// @SpringBootApplication
// @EntityScan("com.example.QuanLyKTX.model")
// @ComponentScan(basePackages = {"com.example.QuanLyKTX.repository"})

// @RestController
// public class QuanLyKyTucXaApplication{
// 	public static void main(String[] args) {
// 		SpringApplication.run(QuanLyKyTucXaApplication.class, args);
// 		System.out.println("Hello Spring");
// 	}
// }
package com.example.QuanLyKTX;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuanLyKTX.model.User;

@SpringBootApplication (scanBasePackages ="com.example.QuanLyKTX")
@RestController
// @EntityScan("com.example.QuanLyKTX.model")
// @ComponentScan(basePackages = {"com.example.QuanLyKTX.repository"})
// @SpringBootApplication(scanBasePackages = "com.example.QuanLyKTX")
public class QuanLyKyTucXaApplication{
	public static void main(String[] args) {
		SpringApplication.run(QuanLyKyTucXaApplication.class, args);
		System.out.println("Hello Spring");
	}

}
