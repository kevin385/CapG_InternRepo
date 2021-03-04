package withdraw;

import deposit.A;

public class D extends A {

	public static void main(String[] args) {
		D obj = new D();
		//System.out.println(obj.a);	//(Cannot be Accessed)
		//System.out.println(obj.b);	//(Cannot be Accessed)
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
