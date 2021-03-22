package day13;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(4,7,-2,8,-3,-11,20,-14));
		ArrayList<Integer> ar1 = (ArrayList<Integer>) ar.stream().filter(a->a%2 == 0 && a>0).collect(Collectors.toList());
		System.out.println(ar1);
	}

}
