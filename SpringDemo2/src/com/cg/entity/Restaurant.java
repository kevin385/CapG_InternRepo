package com.cg.entity;

public class Restaurant {
	HotDrink hotDrink;
	String restaurantName;

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public void setHotDrink(HotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	
	void displayRestaurantDetails() {
		System.out.println("Restaurant Name: "+restaurantName);
		hotDrink.drink();
	}
}
