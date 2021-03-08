package day5;

class Car2 {
	private int yearModel;
	private String make;
	private int speed;
	public Car2(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void accelerate() {
		speed += 5;
	}
	void brake() {
		speed -= 5;
	}

	
	
}

public class Task1 {

	public static void main(String[] args) {
		Car2 car = new Car2(1965, "Batmobile");
		car.accelerate();
		System.out.println("Speed: "+car.getSpeed());
	}

}
