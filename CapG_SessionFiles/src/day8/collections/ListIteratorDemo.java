package day8.collections;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> o2 = new ArrayList<Integer>();
		o2.add(1);
		o2.add(2);
		o2.add(3);
		o2.add(4);
		o2.add(5);
		
		ListIterator<Integer> it = o2.listIterator(); 
		System.out.println("Forward Direction");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Backward Direction");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
