package com.cg.eis.service;

import com.cg.eis.bean.*;
import java.util.*;

public class EmployeeServiceImpl implements IEmployeeService {
	private String[] insuranceScheme = {"Scheme A", "Scheme B", "Scheme C", "No Scheme"};
	@Override
	public void getEmployeeDetails(Map<Integer, Employee> empMap) {
		Employee emp = new Employee();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		emp.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		emp.setName(sc.nextLine());
		System.out.println("Enter Salary: ");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter Designation: ");
		emp.setDesignation(sc.nextLine());
		emp.setInsuranceScheme(calcInsuranceScheme(emp));
		empMap.put(emp.getId(),emp);
	}
	
	@Override
	public String calcInsuranceScheme(Employee emp) {
		if(emp.getSalary()>5000 && emp.getSalary()<20000 && emp.getDesignation().equalsIgnoreCase("System Associate"))
			return insuranceScheme[2];
		if(emp.getSalary()>=20000 && emp.getSalary()<40000 && emp.getDesignation().equalsIgnoreCase("Programmer"))
			return insuranceScheme[1];
		if(emp.getSalary()>=40000 && emp.getDesignation().equalsIgnoreCase("Manager"))
			return insuranceScheme[0];
		else
			return insuranceScheme[3];
	}
	
	@Override
	public void displayEmployeeDetailsById(Map<Integer, Employee> empMap, int id) {
		empMap.entrySet().stream().filter(e->e.getKey() == id).forEach(s->System.out.println(s));
		System.out.println();
	}

	@Override
	public void displayEmployeeDetails(Map<Integer, Employee> empMap) {
		empMap.entrySet().stream().forEach(s->System.out.println(s));
		System.out.println();
	}

	@Override
	public void displayEmployeeDetailsBasedOnInsuranceScheme(Map<Integer, Employee> empMap) {
		for (String insSch: insuranceScheme) {
			System.out.println(insSch+": ");
			empMap.entrySet().stream().filter(s->s.getValue().getInsuranceScheme() == insSch).forEach(s->System.out.println(s));
			System.out.println();
		}
	}

	@Override
	public void deleteEmployeeRecordById(Map<Integer, Employee> empMap, int id) {
		empMap.remove(Integer.valueOf(id));
		
	}
}
