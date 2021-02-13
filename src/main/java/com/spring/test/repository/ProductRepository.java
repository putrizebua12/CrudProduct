package com.spring.test.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.test.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
	
    Product findByName(String name);
    
    @Query(value = "select * from product_tbl pro where pro.name like %:name", nativeQuery = true)
	List<Product> getProductByName(String name);
    
    @Query(value = "select * from product_tbl pro where pro.name like %:price", nativeQuery = true)
	List<Product> getProductByPrice(Double price);
   
}

