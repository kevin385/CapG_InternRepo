package day5;

interface Eligibility {
	String checkAge(int age);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Eligibility e1 = (age)->{
			if (age<18)
				return "You Cannot vote";
			return "You can vote";
		};
		
		System.out.println("Result = "+e1.checkAge(18));
	}

}
