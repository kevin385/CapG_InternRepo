package day8.collections;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.push(4);
		
		Enumeration e = s.elements();
		while (e.hasMoreElements()) {
			System.out.println("Ele: "+e.nextElement());
		}
		
		System.out.println(s);
		System.out.println("Top Element: "+s.peek());
		System.out.println("Popping element: "+s.pop());
		System.out.println(s+"\n========================");
		System.out.println("Top Element: "+s.peek());
		System.out.println("Popping element: "+s.pop());
		System.out.println(s+"\n========================");
		System.out.println("Top Element: "+s.peek());
		System.out.println("Popping element: "+s.pop());
		System.out.println(s+"\n========================");
		System.out.println("Top Element: "+s.peek());
		System.out.println("Popping element: "+s.pop());
		System.out.println(s+"\n========================");
	}

}
