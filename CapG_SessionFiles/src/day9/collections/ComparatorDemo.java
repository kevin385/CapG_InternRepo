package day9.collections;

import java.util.*;

class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id == o2.id)
			return 0;
		else if(o1.id > o2.id)
			return 1;
		return -1;
	}
	
}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.marks == o2.marks)
			return 0;
		else if(o1.marks > o2.marks)
			return 1;
		return -1;
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(1,"kumar",87));
		stuList.add(new Student(3,"mark",73));
		stuList.add(new Student(2,"john",91));
		
		for(Student s: stuList) {
			System.out.println(s.id+" "+s.name+" "+s.marks);	
		}
		
		System.out.println("======================");
		Collections.sort(stuList, new IdComparator());
		for(Student s: stuList) {
			System.out.println(s.id+" "+s.name+" "+s.marks);	
		}
		
		System.out.println("======================");
		Collections.sort(stuList, new NameComparator());
		for(Student s: stuList) {
			System.out.println(s.id+" "+s.name+" "+s.marks);	
		}
		
		System.out.println("======================");
		Collections.sort(stuList, new MarksComparator());
		for(Student s: stuList) {
			System.out.println(s.id+" "+s.name+" "+s.marks);	
		}
	}

}
