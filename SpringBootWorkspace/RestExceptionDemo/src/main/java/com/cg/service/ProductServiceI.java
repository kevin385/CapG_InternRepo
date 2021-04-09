package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Product;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.PriceException;

@Service
public interface ProductServiceI {
	public Product addProduct(Product product) throws PriceException;
	
	public List<Product> getAllProducts();
	
	public Product getById(int id) throws IdNotFoundException;

	public void deleteById(int id) throws IdNotFoundException;
}
