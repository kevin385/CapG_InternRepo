package day3.oops;

class Bank2{
	void rateOfInterest() {
		System.out.println("1%");
	}
	static void display() {
		System.out.println("In Parent");
	}
}

class SBI2 extends Bank2 {
	void rateOfInterest() {
		System.out.println("5%");
	}
	static void display() {
		System.out.println("In SBI");
	}
}

class Kotak extends Bank2 {
	void rateOfInterest() {
		System.out.println("6%");
	}
	static void display() {
		System.out.println("In Kotak");
	}
}

public class OverridingDemo2 {

	public static void main(String[] args) {
		Bank2 bank2 = new SBI2();
		bank2.rateOfInterest();
		bank2.display();

	}

}
