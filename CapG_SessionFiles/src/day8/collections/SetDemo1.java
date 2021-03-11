package day8.collections;

import java.util.*;

class Emp1 {
	int id;
	String name;
	public Emp1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class SetDemo1 {

	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(3);
		s.add(3);	//does not add since no duplicates
		s.add(45);
		s.add("Hello".hashCode());
		s.add("Hello".hashCode());	//does not add since no duplicates
		s.add(100);
		
		System.out.println(s);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("hi");
		lhs.add("hello");
		lhs.add("hi");
		lhs.add(45);
		lhs.add(100);
		lhs.add("thank you");
		
		System.out.println("LinkedHashSet: "+lhs);
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(5);
		ts.add(45);
		ts.add(100);
		
		System.out.println("TreeSet: "+ts);
		
		TreeSet<Emp1> emp = new TreeSet<Emp1>();
		emp.add(new Emp1(1,"sachin"));
		emp.add(new Emp1(2,"rahul"));
		System.out.println("Treeset "+emp);
		
	}

}
