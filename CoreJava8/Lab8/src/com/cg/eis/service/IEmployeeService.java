package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {
	public void getEmployeeDetails(Map<Integer, Employee> empMap);
	public String calcInsuranceScheme(Employee emp);
	public void displayEmployeeDetailsById(Map<Integer, Employee> empMap, int id);
	public void displayEmployeeDetails(Map<Integer, Employee> empMap);
	public void displayEmployeeDetailsBasedOnInsuranceScheme(Map<Integer, Employee> empMap);
	public void deleteEmployeeRecordById(Map<Integer, Employee> empMap, int id);
}
