package com.spring.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.test.entity.Product;
import com.spring.test.repository.ProductRepository;

@SpringBootApplication
public class AppCrud {

	public static void main(String[] args) {
		SpringApplication.run(AppCrud.class, args);
	}
	
	 @Bean
	    public CommandLineRunner demo(ProductRepository repo) {
	        return (args) -> {
	            repo.save(new Product(1, "Mobil", 1, 3000000.0));
	            repo.save(new Product(2, "Truck", 1, 3000000.0));
	            
	        };

	 }
}
