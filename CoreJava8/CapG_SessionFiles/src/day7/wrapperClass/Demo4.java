package day7.wrapperClass;

public class Demo4 {

	public static void main(String[] args) {
		Integer a = 100;	//in memory pool
		Integer b = 100;
		
		Integer c = 128;	//not in integer range
		Integer d = 128;
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(c==d);
		System.out.println(c.equals(d));

	}

}
