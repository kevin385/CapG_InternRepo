package com.day14.designPattern;

class Employee {
	
	private static final Employee emp = new Employee();
	
	private Employee() {
		System.out.println("This is employee constructor");
	}
	
	public static Employee getEmployeeInstance() {
		return emp;
	}
}


public class SingletonPattern {

	public static void main(String[] args) {
		
		Employee e1 = Employee.getEmployeeInstance();
		System.out.println(e1.hashCode());
		
		Employee e2 = Employee.getEmployeeInstance();
		System.out.println(e2.hashCode());
	}

}
