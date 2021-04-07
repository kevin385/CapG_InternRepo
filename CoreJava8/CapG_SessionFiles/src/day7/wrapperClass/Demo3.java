package day7.wrapperClass;

public class Demo3 {

	public static void main(String[] args) {
		//Integer a = 100;
		//Integer b = 200;
		Integer c = new Integer(100);
		Integer d = new Integer(100);
		
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(c==d);
		System.out.println(c.equals(d));
		

	}

}
