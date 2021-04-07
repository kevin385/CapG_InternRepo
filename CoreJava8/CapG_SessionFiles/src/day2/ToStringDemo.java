package day2;

class Car{
	int year;
	String brandName;
	
	public Car(int year, String brandName) {
		super();
		this.year = year;
		this.brandName = brandName;
	}

	public String toString() {
		return "Car [year=" + year + ", brandName=" + brandName + "]";
	}
}

public class ToStringDemo {
	public static void main(String[] args) {
		Car c1 = new Car(1995, "Maruthi");
		Car c2 = new Car(2006, "Hyundai");
		System.out.println(c1);
		System.out.println(c2);
		
	}
}
