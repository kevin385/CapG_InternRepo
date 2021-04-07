package day5;

interface Vehicle {
	void noOfWheels();
}


class Car implements Vehicle {
	public void noOfWheels() {
		System.out.println("Car has 4 wheels");
	}
}

class Bike implements Vehicle {
	public void noOfWheels() {
		System.out.println("Bike has 3 wheels");
	}
}


class Bus implements Vehicle {
	public void noOfWheels() {
		System.out.println("Bus has 6 wheels");
	}
}


public class InterfaceTest1 {

	public static void main(String[] args) {
		Vehicle c = new Car();
		c.noOfWheels();
		Vehicle b = new Bike();
		b.noOfWheels();
		Vehicle bu = new Bus();
		bu.noOfWheels();
	}

}
