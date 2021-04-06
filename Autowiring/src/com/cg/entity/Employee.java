package com.cg.entity;

public class Employee {
	String name;
	Address addr;
	Vehicle vehicle;
	
	
	public Employee(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
		System.out.println("one argument");
	}
	
	
	
	public Employee(Address addr, Vehicle vehicle) {
		super();
		this.addr = addr;
		this.vehicle = vehicle;
		System.out.println("2 argument");
	}



	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void displayEmpDetails() {
		System.out.println("name: "+name);
		addr.displayAddress();
	}
}
