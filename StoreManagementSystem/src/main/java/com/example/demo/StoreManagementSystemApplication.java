package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.StoreBillingDesk;

@SpringBootApplication
@ComponentScan(basePackageClasses=StoreBillingDesk.class)
public class StoreManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreManagementSystemApplication.class, args);
	}

}
