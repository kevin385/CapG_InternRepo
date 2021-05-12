package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CustomerDaoI;
import com.cg.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerServiceI {
	
	@Autowired
	CustomerDaoI customerDao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.save(customer);
	}

}
