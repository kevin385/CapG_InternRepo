package day4.oops;

abstract class Calculate {
	int a=10;
	void display() {
		System.out.println("This is normal method");
	}
	
	abstract int doOperation(int a, int b);
}

class Add extends Calculate {
	int doOperation(int a, int b) {
		return a+b;
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Calculate c = new Add();
		System.out.println("Result: "+c.doOperation(5,2));
	}

}
