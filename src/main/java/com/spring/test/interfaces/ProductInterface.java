package com.spring.test.interfaces;

import java.util.List;

import com.spring.test.entity.Product;

public interface ProductInterface {

	List<Product> findAll();
	Product save(Product product);
	List<Product> getProductByName(String name);
	List<Product> getProductByPrice(Double price);
}
