package com.cg.demo3;

import java.util.List;

public class Fruit {
	List fruitNames;

	public void setFruitNames(List fruitNames) {
		this.fruitNames = fruitNames;
	}
	
	void displayNames() {
		System.out.println("Fruit Names: "+fruitNames);
	}
}
