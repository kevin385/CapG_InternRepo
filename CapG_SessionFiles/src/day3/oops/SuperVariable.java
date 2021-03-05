package day3.oops;

class Parent {
	int a = 10;
}

class Child extends Parent {
	int a = 20;
	void add() {
		System.out.println("Parent Value: "+super.a);
		System.out.println("Child Value: "+a);
		int result = a+a;				//40
		int result1 = a+super.a;		//30
		int result2 = super.a + super.a; //20
		System.out.println("Result: "+result);
		System.out.println("Result1: "+result1);
		System.out.println("Result2: "+result2);
	}
}

public class SuperVariable {

	public static void main(String[] args) {
		Child child = new Child();
		child.add();
	}

}
