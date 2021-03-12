package day9;

class MinCharException extends Exception {
	@Override
	public String toString() {
		return "Name should have minimum 3 characters";
	}
}

class Employee {
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	void validation() throws MinCharException {
		if(firstName == null || lastName == null)
			throw new NullPointerException("Entry Missing");
		if(firstName.length()<3 || lastName.length()<3) {
			throw new MinCharException();
		}
	}
}

public class Question3 {

	public static void main(String[] args) {
		Employee emp = new Employee("hi","bye");
		try {
			emp.validation();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("End");
	}
}
