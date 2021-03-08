package day5.exception;

public class ThrowDemo {

	void checkEligibility(int age) {
		if (age<18) {
			throw new ArithmeticException("You cannot vote");
		}
		else {
			System.out.println("You can vote");
		}
	}
	
	public static void main(String[] args) {
		
		//throw new ArithmeticException("I have thrown an exception.");
		ThrowDemo t = new ThrowDemo();
		t.checkEligibility(3);
	}

}
