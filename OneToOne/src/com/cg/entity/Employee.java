package com.cg.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee70")
public class Employee {
	@Id
	private int id;
	private String name;
	private int salary;
	private String designation;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")	//to give foreign key
	private Address address;

	public int getId() { 
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
