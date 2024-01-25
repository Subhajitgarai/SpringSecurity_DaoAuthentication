package com.springsecurity.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootDaoAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDaoAuthenticationApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("Subhajit@123"));
	}

}
