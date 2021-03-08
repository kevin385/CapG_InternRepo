package day5;

interface Bank {
	void rateOfInterest();	//implicitly public abstract
							//how to provide implementation -> by overriding
	int workingDays = 27;
}

interface Loan {
	abstract void creditLimit();
}

class SBI implements Bank, Loan {
	public void rateOfInterest() {
		System.out.println("4% of interest");
		System.out.println("Bank working day: "+ workingDays);
	}
	
	public void creditLimit() {
		System.out.println("Upto 1CR for Current Acc");
		System.out.println("Upto 30 Lakh for Savings Acc");
	}
}


public class InterfaceDemo1 {

	public static void main(String[] args) {
		Bank b = new SBI();
		b.rateOfInterest();
		System.out.println("==================");
		SBI s = new SBI();
		s.rateOfInterest();
		s.creditLimit();
	}

}
