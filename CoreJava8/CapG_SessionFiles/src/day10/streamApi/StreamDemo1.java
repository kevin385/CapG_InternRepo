package day10.streamApi;

import java.util.*;
import java.util.stream.*;

public class StreamDemo1 {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1, "sachin", "hr", 45000, 32));
		emplist.add(new Employee(2, "ravi", "developer", 85000, 32));
		emplist.add(new Employee(3, "kumar", "developer", 50000, 33));
		emplist.add(new Employee(4, "rahul", "hr", 25000, 26));
		emplist.add(new Employee(5, "manish", "manager", 90000, 32));
		
		//System.out.println(emplist);
	
		emplist.forEach(s->System.out.println(s));
		emplist.forEach(s->System.out.println(s.getDepartment()));
		
		System.out.println("By using method reference");
		emplist.forEach(System.out::println);
		
		long empCount = emplist.stream().count();
		System.out.println("Employee Count is: "+empCount);
		System.out.println("===================");
		
		System.out.println("===Display only developer===");
		emplist.stream().filter(e->e.getDepartment().equalsIgnoreCase("developer")).forEach(s->System.out.println(s));

		
		System.out.println("===Display developer count===");
		long devCount = emplist.stream().filter(e->e.getDepartment().equalsIgnoreCase("developer")).count();
		System.out.println(devCount);
		
		System.out.println("====name length dept====");
		emplist.stream().map(e->e.getName()+" "+e.getName().length()+" "+e.getDepartment()).forEach(s->System.out.println(s));
	
		System.out.println("===increase salary by 10%===");
		emplist.stream().map(e->e.getSalary()+" "+e.getSalary()*1.1).forEach(s->System.out.println(s));
	
		System.out.println("===Total employee salary===");
		long salSum = emplist.stream().mapToInt(s->s.getSalary()).sum();
		System.out.println("Total Employee Salary: "+salSum);
	
		System.out.println("===Developer Salary===");
		emplist.stream().filter(e->e.getDepartment().equalsIgnoreCase("developer")).map(e->e.getDepartment()+" "+e.getSalary()).forEach(s->System.out.println(s));
		 
		System.out.println("Print names who belong to developer");
		emplist.stream().filter(e->e.getDepartment().equalsIgnoreCase("developer")).map(e->e.getName()).forEach(s->System.out.println(s));
	
		List<Employee> t = emplist.stream().filter(s->s.getName().startsWith("r")).collect(Collectors.toList());
		t.forEach(s->System.out.println());
		
		System.out.println("Print names who dont belong to developer");
		emplist.stream().filter(s->s.getDepartment()!="developer").map(e->e.getName()).forEach(s->System.out.println(s));
	}

}
