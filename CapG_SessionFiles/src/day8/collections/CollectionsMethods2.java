package day8.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethods2 {

	public static void main(String[] args) {
		ArrayList<Integer> o2 = new ArrayList<Integer>();
		o2.add(3);
		o2.add(4);
		o2.add(100);
		o2.add(101);
		o2.add(102);
		System.out.println("Elements of o2: "+o2);
		
		int min = Collections.min(o2);	
		System.out.println("Minimum = "+min);
		
		int max = Collections.max(o2);
		System.out.println("Maximum = "+max);
	
	}

}
