package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
import java.util.stream.Collectors;

public class EmployeeImplementation {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1, "achin", 45000, 20, "nitin"));
		emplist.add(new Employee(2, "ravi", 85000, 3, "john"));
		emplist.add(new Employee(3, "kumar", 50000, 10, "nitin"));
		emplist.add(new Employee(4, "ahul", 25000, 10, "matt"));
		emplist.add(new Employee(5, "manish", 90000, 20, "john"));
		
		System.out.println(emplist.stream().mapToInt(e->e.getSalary()).max());
		
		
		long count1 = emplist.stream().filter(e->e.getMgrname().equalsIgnoreCase("nitin")).count();
		System.out.println("Count1: "+count1);
		
		emplist.stream().filter(e->e.getDeptno()==10).map(e->e.getName()).forEach(s->System.out.println(s));
	
		long count2 = emplist.stream().filter(e->e.getDeptno()==20).count();
		System.out.println("Count2: "+count2);
		
		List<Employee> emp = emplist.stream().filter(e->e.getName().charAt(0)=='a').collect(Collectors.toList());
		System.out.println(emp);
		
		emplist.stream().filter(e->e.getSalary()<50000).map(e->e.getName()).forEach(s->System.out.println(s));
	}

}
