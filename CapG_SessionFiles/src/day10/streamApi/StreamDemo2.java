package day10.streamApi;

import java.util.*;

public class StreamDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(3);
		num.add(10);
		num.add(24);
		num.add(5);
		
		num.forEach(x->System.out.println(x));
		
		System.out.println("After Sorting");
		
		num.stream().sorted().forEach(x->System.out.println(x));

		ArrayList<String> names = new ArrayList<String>();
		names.add("sachin");
		names.add("anand");
		names.add("ankit");
		names.add("rohit");
		names.stream().sorted().forEach(x->System.out.println(x));
	}

}
