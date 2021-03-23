package com.day14.designPattern;

interface Car {
	void capacity();
}

class HatchBack implements Car {

	@Override
	public void capacity() {
		System.out.println("4 people");
	}
	
}

class Jeep implements Car {

	@Override
	public void capacity() {
		System.out.println("6 people");
		
	}
	
}

class Suv implements Car {

	@Override
	public void capacity() {
		System.out.println("4 comfortable");
		
	}
	
}

class CarFactory {
	Car getCar(String type) {
		if(type.equalsIgnoreCase("hatchback")) {
			return new HatchBack();
		}
		else if (type.equalsIgnoreCase("jeep")) {
			return new Jeep();
		}
		else if(type.equalsIgnoreCase("suv")) {
			return new Suv();
		}
		return null;
	}
}

public class FactoryDesignPattern {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car car = carFactory.getCar("jeep");
		car.capacity();
	}
}
