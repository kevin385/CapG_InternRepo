package day10.streamApi;

import java.util.*;
import java.util.function.*;

interface Pre {
	
}

public class InbuiltFunctionDemo {

	public static void main(String[] args) {
		Predicate<Integer> p1 = (age) -> age>18;
		boolean b = p1.test(34);
		System.out.println(b);
		
		Function<String, Integer> f1 = (name)->name.length();
		int length = f1.apply("sachin");
		System.out.println(length);
		
		Function<String, String> f2 = (name) -> name.concat(" mr");
		String name = f2.apply("sachin");
		System.out.println(name);
		
		Predicate<String> p2 = (name1) -> name1.charAt(0)=='A' || name1.charAt(0)=='a';
		boolean t1 = p2.test("abc");
		System.out.println(t1);
	}

}
