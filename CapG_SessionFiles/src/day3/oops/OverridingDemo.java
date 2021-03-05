package day3.oops;

class Parent2 {
	void breakFast() {
		System.out.println("Idly");
	}
	void vehicle() {
		System.out.println("Audi A4");
	}
}

class Child2 extends Parent2 {
	void breakFast() {
		System.out.println("Maggi");
	}
	void vehicle() {
		super.vehicle();
		System.out.println("Hyundai i20");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.breakFast();
		child2.vehicle();
	}

}
