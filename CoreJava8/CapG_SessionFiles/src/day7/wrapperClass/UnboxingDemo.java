package day7.wrapperClass;

public class UnboxingDemo {

	public static void main(String[] args) {
		Integer a = 10;	//object
		
		int b = a;		//unboxing (automatically)
		
		int c = a.intValue();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

	}

}
