package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/employeeApi")
public class EmployeeController {
	ArrayList<Employee> empList;
	public EmployeeController() {
		empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "sachin", 34000, "developer"));
		empList.add(new Employee(2, "ravi", 56000, "hr"));
		empList.add(new Employee(3, "john", 30000, "analyst"));
	}
	
	@GetMapping(value = "/employeeList")
	public List<Employee> getEmployeeList() {
		return empList;
	}
	
	@GetMapping(value = "/getEmployeeById/{empid}")
	public Employee getByEmployeeId(@PathVariable int empid) {
		Employee e = null;
		for(Employee emp: empList) {
			if(emp.getId() == empid)
				e = emp;
		}
		return e;
	}
	
	@PostMapping(value = "/addNewEmployee")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee emp) {
		empList.add(emp);
		return new ResponseEntity<Object>("successfully added", HttpStatus.OK);
	}
	
	@PostMapping(value = "/addNewEmployee2")
	public String addEmployee2(@RequestBody Employee emp) {
		empList.add(emp);
		return "new employee added";
	}
	
	@DeleteMapping(value = "/deleteEmployeeById/{empid}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable int empid) {
		for(Employee emp: empList) {
			if(emp.getId() == empid)
				empList.remove(empid);
		}
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}
	
	@PutMapping(value="updateEmployee/{empid}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable int empid)
    {
        System.out.println("before update :"+empList.get(empid-1));

        empList.set(empid-1, employee);
        System.out.println("after update :"+empList.get(empid-1));
        
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);

    }
	
}
