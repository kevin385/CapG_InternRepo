package com.cg.eis.service;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.*;

public class EmployeeServiceImpl implements IEmployeeService{
	IEmployeeDAO dao = new EmployeeDAO();

	@Override
	public double getSumSal(List<Employee> elist) {
		return dao.getSumSal(elist);
	}

	@Override
	public List<Employee> sortByName(List<Employee> elist) {
		return dao.sortByName(elist);
	}

	@Override
	public Employee findById(int id) {
		return dao.findById(id);
	}
	
	
}
