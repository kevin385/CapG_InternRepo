package day8.collections;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		System.out.println(v1);
		System.out.println(v1.capacity());
	}

}
