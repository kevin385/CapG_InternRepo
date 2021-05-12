package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.entity.Customer;

@Service
public interface CustomerServiceI {
	public Customer addCustomer(Customer customer);
	
	
}
