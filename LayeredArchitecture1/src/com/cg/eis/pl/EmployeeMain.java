package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.exceptions.IdNotFoundException;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.util.EmployeeRepo;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) throws IdNotFoundException {
		EmployeeRepo er = new EmployeeRepo();
		EmployeeServiceImpl es = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = er.getEmployees();
		System.out.println("Details of employee: ");
		
		employees.forEach(System.out::println);
		System.out.println("----------------\nTotal Salary: "+es.getSumSal(employees));
		System.out.println("----------------");
		System.out.println("Sort employees based on name");
		List<Employee> emps = es.sortByName(employees);
		
		for(Employee e: emps) {
			System.out.println(e);
		}
		System.out.println("----------------");
		System.out.println("Enter id to search for: ");
		int id = sc.nextInt();
		Employee e = es.findById(id);
		if(e != null) 
			System.out.println();
		else
			throw new IdNotFoundException("Employee Id not found");
		sc.close();
	}
}
