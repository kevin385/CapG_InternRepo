package day10;

import java.util.stream.Stream;

/*
abstract class Planet {
	protected void revolve() {
		
	}
	abstract void rotate();
}

class Earth extends Planet {
	protected void revolve() {
		
	}
	protected void rotate() {
		
	}
}

public class Test {
	
	public static void main(String[] args) {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		//total += letters.substring(1,2).length();
		total += letters.substring(6,6).length();
		//total += letters.substring(6,5).length();
		System.out.println(total);
	}
}
*/
//interface A{
//	static int func() {
//		return 0;
//	}
//}
//
//class Test2{
//	public void func() {
//		System.out.println("hi0");
//	}
//}
//
//public class Test extends Test2 implements A{
//	public int func() {
//		System.out.println("hi1");
//		return 1;
//	}
//	public static void main(String[] args) {
//		Test ob = new Test();
//		A a =new Test();
//		ob.func();
//		a.func();
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		try {
//			return;
//		}
//		finally {
//			System.out.println("finally");
//		}
//	}
//}

class Test {
	public static void main(String[] args) {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .sorted((s1, s2) -> {
	        System.out.printf("sort: %s; %s\n", s1, s2);
	        return s1.compareTo(s2);
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
	}
}
