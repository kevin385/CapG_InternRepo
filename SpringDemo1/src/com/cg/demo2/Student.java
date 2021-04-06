package com.cg.demo2;

public class Student {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void displayDetails() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}
}
