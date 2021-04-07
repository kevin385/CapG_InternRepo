package day5;

interface Vehicle1 {
	void wheel();
}

interface Engine {
	void engine();
}

class TestDrive {
	void drive() {
		System.out.println("Take a Testdrive");
	}
}

class Car1 extends TestDrive implements Vehicle1, Engine {

	public void engine() {
		System.out.println("4 wheel");
	}

	public void wheel() {
		System.out.println("Petrol Engine");
	}
	
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Car1 c = new Car1();
		c.engine();
		c.wheel();
	}
}
