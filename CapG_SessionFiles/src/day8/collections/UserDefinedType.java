package day8.collections;

import java.util.*;

class Employee {
	int id;
	String name;
	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
}

public class UserDefinedType {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "sachin", "hr"));
		empList.add(new Employee(2, "sachin", "dev"));
		empList.add(new Employee(3, "sachin", "testing"));
		
		System.out.println("Employee List: "+ empList);
	
		Iterator<Employee> it = empList.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("ID: "+e.id+" Name: "+e.name+" Dept: "+e.dept);
			
		}
		
	}

}
