package day7.wrapperClass;

public class WrapperDemo1 {

	public static void main(String[] args) {
		int a = 10;
		
		Integer b = a;	//autoboxing from java 1.5 (compiler does automatically)
		
		Integer c = Integer.valueOf(a);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
