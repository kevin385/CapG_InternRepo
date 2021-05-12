package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.exception.PriceException;
import com.cg.exception.ValidationException;
import com.cg.service.ProductServiceI;

import io.swagger.annotations.*;

@Api("Product controller validation")
@RestController
@RequestMapping("/product")
public class ProductControllerValidation {
	@Autowired
	ProductServiceI productServiceI;
	
	@PostMapping(value = "/addNewProduct")
	public ResponseEntity<Object> addNewProduct1(@RequestBody Product product, BindingResult bindingResult) throws MethodArgumentNotValidException, PriceException{
		
		String error = "";
		
		if(bindingResult.hasErrors()) {
			System.out.println("Yes it has errors");
			
			List<FieldError> errors = bindingResult.getFieldErrors();
			System.out.println("Errors: "+errors);
			
			List<String> errorList = new ArrayList<String>();
			
			for(FieldError e: errors) {
				errorList.add(e.getDefaultMessage());
			}
			
			throw new ValidationException(errorList);
		}
		
		try {
			productServiceI.addProduct(product);
		} catch(PriceException e) {
			throw new PriceException("price should be greater than 0");
		}
		
		return new ResponseEntity<Object>("added", HttpStatus.OK);
	}

}
