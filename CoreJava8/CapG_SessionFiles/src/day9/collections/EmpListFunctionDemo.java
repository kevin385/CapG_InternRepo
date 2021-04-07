package day9.collections;

import java.util.*;

class Employee1 {
	int id;
	String name;
	String dept;
	int salary;
	public Employee1(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}

/**
 * @author Kevin
 *
 */
public class EmpListFunctionDemo {

	ArrayList<Employee1> findByDept(String dept, ArrayList<Employee1> empList) {
		ArrayList<Employee1> tempEmpList = new ArrayList<Employee1>();;
		Iterator<Employee1> it = empList.iterator();
		while(it.hasNext()) {
			Employee1 e1 = it.next();
			if (!e1.dept.equals(dept)) {
				tempEmpList.add(e1);
			}	
		}
		return tempEmpList;
	}
	
	public static void main(String[] args) {
		ArrayList<Employee1> empList = new ArrayList<Employee1>();
		EmpListFunctionDemo cd = new EmpListFunctionDemo();
		empList.add(new Employee1(1,"ravi","hr",65000));
		empList.add(new Employee1(2,"anit","developer",80000));
		empList.add(new Employee1(3,"suresh","ui",80000));
		empList.add(new Employee1(4,"mark","developer",75000));
		ArrayList<Employee1> tempEmpList = cd.findByDept("developer", empList);
		System.out.println(tempEmpList);
		System.out.println(empList);
	}
}

