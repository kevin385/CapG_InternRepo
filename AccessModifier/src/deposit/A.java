package deposit;

public class A {
	private int a=1;		//private
	int b=20;				//default
	protected int c=3;		//protected
	public int d=4;			//public
	
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
