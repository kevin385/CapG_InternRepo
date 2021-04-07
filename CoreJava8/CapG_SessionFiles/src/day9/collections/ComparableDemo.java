package day9.collections;

import java.util.*;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	int salary;
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]\n";
	}
	@Override
	public int compareTo(Employee o) {
		if(id == o.id) {
			return 0;
		}
		else if(id>o.id) {
			return 1;
		}
		return -1;
	}
}

public class ComparableDemo {
	
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		ComparableDemo cd = new ComparableDemo();
		empList.add(new Employee(1,"ravi","hr",65000));
		empList.add(new Employee(2,"anit","developer",80000));
		empList.add(new Employee(17,"suresh","ui",80000));
		empList.add(new Employee(4,"mark","developer",75000));
		System.out.println(empList);
		System.out.println("=====================");
		Collections.sort(empList);
		System.out.println(empList);
		
		
		
	}
}
