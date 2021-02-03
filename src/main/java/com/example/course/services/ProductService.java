package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product> findAll(){
		List<Product> list= productRepository.findAll();
		return list;
	}
	
	
	public Product findById(Long id){
		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}
}
