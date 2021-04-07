package day10.newFeatures;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			numList.add(i);
		}
		System.out.println(numList);
		
		numList.forEach(s->System.out.println(s));
		
		System.out.println("=====After Filter=====");
		numList.stream().filter(s -> s>5).forEach(s -> System.out.println(s));
		
		
	}

}
