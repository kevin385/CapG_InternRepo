package com.cg.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.PriceException;
import com.cg.service.ProductServiceI;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api("Product Controller")
@RestController
@RequestMapping(value="/product")
public class ProductController {
	
	@Autowired
	ProductServiceI productService;
	
	@ApiOperation(value="Add new product")
	@PostMapping(value="/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody Product product) throws PriceException {
		try {
			productService.addProduct(product);
			return new ResponseEntity<String>("Added product successfully", HttpStatus.OK);
		} catch(PriceException e) {
			throw new PriceException("Price should be greater than 0");
		}
		
	}

	@ApiOperation(value="Get all the product")
	@GetMapping(value="/getAll")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@ApiOperation(value="Get product by ID")
	@GetMapping(value="/getById/{id}")
	public Product getProductById(@PathVariable int id) throws IdNotFoundException {
		try {
			return productService.getById(id);
		} catch (IdNotFoundException e) {
			throw new IdNotFoundException("No ID found");
		}

	}
	
	@DeleteMapping(value="/deleteById/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable int id) throws IdNotFoundException {
		try {
			productService.deleteById(id);
			return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
			
		} catch (IdNotFoundException e) {
			throw new IdNotFoundException("No ID found");
		}
		
	}
}
