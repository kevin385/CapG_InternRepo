package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Customer;
import com.cg.service.CustomerServiceI;

import io.swagger.annotations.Api;

@Api("customer controller")
@RestController
@RequestMapping(value = "/customer")
@CrossOrigin
public class CustomerController {
	
	@Autowired
	CustomerServiceI customerService;
	
	@PostMapping(value = "/addNewCustomer")
	public ResponseEntity<Object> addNewCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return new ResponseEntity<Object>("Added", HttpStatus.OK);
	}
}
