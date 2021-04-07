package day8.collections;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> o2 = new ArrayList<Integer>();
		o2.add(1);
		o2.add(2);
		o2.add(3);
		o2.add(4);
		o2.add(5);
		Iterator<Integer> it = o2.iterator();
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			int num = it.next();
			if (num < 3) {
				it.remove();
				System.out.println(num);
			}
			
				
		}
		System.out.println("Elements of o2: "+o2);
		
		
		
	}

}
