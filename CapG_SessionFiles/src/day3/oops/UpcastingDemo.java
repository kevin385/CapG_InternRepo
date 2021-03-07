package day3.oops;

class Bank {
	void rateOfInterest() {
		System.out.println("Not yet Assigned");
	}
}

class Sbi3 extends Bank {
	void rateOfInterest() {
		System.out.println("SBI 4%");
	}
	void offer() {
		System.out.println("SBI Offer");
	}
}

class Axis extends Bank {
	void rateOfInterest() {
		System.out.println("Axis 6%");
	}
	void offer() {
		System.out.println("Axis Offer");
	}
}


public class UpcastingDemo {

	public static void main(String[] args) {
		//upcasting --> Will call only overridden method
		//				and Parent functions
		Bank sbi = new Sbi3();
		sbi.rateOfInterest();
		//sbi.offer();	//Does not work
		
		Bank ax = new Axis();
		ax.rateOfInterest();
		
		Sbi3 s = new Sbi3();
		s.offer();
	}

}
