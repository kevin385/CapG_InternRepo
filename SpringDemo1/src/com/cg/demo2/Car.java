package com.cg.demo2;

public class Car {
	Engine engine;
	int manufactureYear;
	
	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	void displayCarDetails() {
		engine.engineType();
		System.out.println("Manufacture Year: "+manufactureYear);
	}
}
