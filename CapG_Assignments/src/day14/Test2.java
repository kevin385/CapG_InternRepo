package day14;

import java.util.*;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String name;
	private String department;
	private int marks;
	public Student(int id, String name, String department, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", marks=" + marks + "]";
	}
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

public class Test2 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(1, "Kevin", "cse", 80));
		stuList.add(new Student(2, "Mark", "cse", 70));
		stuList.add(new Student(3, "John", "cse", 90));
		stuList.add(new Student(4, "Rahul", "ISE", 50));
		stuList.stream().filter(s->s.getDepartment().equalsIgnoreCase("cse")).forEach(s->System.out.println(s));
		List<Student> ascList = stuList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		List<Student> dscList = stuList.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
		List<Student> passList = stuList.stream().filter(s->s.getMarks()>50).collect(Collectors.toList());
		System.out.println(ascList+"\n"+dscList+"\n"+passList);
	}
}
