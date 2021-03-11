package day8.collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.addFirst(30);
		l.addLast(50); 		
		l.add(5);
		System.out.println(l);
	}

}
