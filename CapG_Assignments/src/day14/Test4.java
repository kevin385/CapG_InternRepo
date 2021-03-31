package day14;

import java.util.*;

@SuppressWarnings("serial")
class InvalidCountryException1 extends Exception {
	@Override
	public String toString() {
		return "User outside India cannot vote";
	}
	
}

@SuppressWarnings("serial")
class AgeNotEligibleException extends Exception {
	@Override
	public String toString() {
		return "Not Eligible to vote by Age";
	}
}

class VoterRegistration {
	void registerVoter(String userName, String userCountry, int age) {
		try{
			if (!userCountry.equalsIgnoreCase("India"))
				throw new InvalidCountryException1();
			else if (age<18)
				throw new AgeNotEligibleException();
			else
				System.out.println("User can Vote");
		} catch(InvalidCountryException1 e) {
			e.printStackTrace();
		} catch(AgeNotEligibleException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VoterRegistration ob = new VoterRegistration();
		String userName = sc.next();
		String userCountry = sc.next();
		int age = sc.nextInt();
		ob.registerVoter(userName, userCountry, age);
		sc.close();
	}
}