package day5;

@FunctionalInterface
interface Test
{
	abstract void display();
	//abstract void display2();		//only 1 abstract method for functional interface
	/*
	static void display2() {
		
	}
	default void display3() {
		
	}
	*/
}

@FunctionalInterface
interface Calculate {
	int operation(int a, int b);
}

public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
		//int a = 10;
		//A o = new A();
		Test t = ()->System.out.println("Hello this is display method implementation");
		Test t2 = ()-> {
			System.out.println("=================");
			System.out.println("Line 1 of display");
			System.out.println("Line 2 of display");
			System.out.println("=================");
		};
		t.display();
		t2.display();
		System.out.println();
		
		Calculate add = (a,b)-> a+b;
		Calculate sub = (a,b)-> a-b;
		Calculate mul = (a,b)-> a*b;
		System.out.println("Add Result: "+add.operation(4,2));
		System.out.println("Sub Result: "+sub.operation(4,2));
		System.out.println("Mul Result: "+mul.operation(4,2));
	}

}
