package day10.streamApi;

import java.util.*;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l= Arrays.asList(11,23,14,5,9,12);
		l.stream().forEach(s->System.out.println(s));
		
		System.out.println("============limit to 3 objects==============");
		l.stream().limit(3).forEach((s->System.out.println(s)));
		System.out.println("==========================================");
		
		
		System.out.println("=========skip========");
		l.stream().skip(4).forEach(s->System.out.println(s));
		System.out.println("==========================================");
		
		
		System.out.println("=====distinct elements=======");
		l.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("==========================================");
		
		
		
		boolean b=l.stream().allMatch(s->s>10);
		System.out.println("all values are greater 10 :"+b);
	}

}
