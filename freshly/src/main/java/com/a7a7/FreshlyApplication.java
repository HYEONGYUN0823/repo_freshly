package com.a7a7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class FreshlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshlyApplication.class, args);
	}

}
