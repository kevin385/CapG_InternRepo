package lab5;

import java.util.*;

class fieldBlankException extends Exception {
	private String fname, lname;
	public fieldBlankException(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "First name or Last name is blank";
	}
}

class Employee {
	String firstName, lastName;
	Scanner sc = new Scanner(System.in);
	void getDetails() throws fieldBlankException {
		System.out.println("Enter first and last name: ");
		firstName = sc.nextLine();
		lastName = sc.nextLine();
		if (firstName.isEmpty() || lastName.isEmpty())
			throw new fieldBlankException(firstName, lastName);
		else
			System.out.println("Thank you");
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		try {
			Employee emp = new Employee();
			emp.getDetails();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
