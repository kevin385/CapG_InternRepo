package day3.oops;

class Employee2 {
	int id;
	String name;
	String dept;
	Address ad;	//Entity Reference or Object Reference
	
	public Employee2(int id, String name, String dept, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.ad = ad;
	}
	
	void displayEmployeeDetails() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Dept: "+dept);
		System.out.println("Door No: "+ad.doorNo);
		System.out.println("Street Name: "+ad.streetName);
		System.out.println("Pin Code: "+ad.pincode);
	}
}

class Address {
	int doorNo;
	String streetName;
	int pincode;
	
	public Address(int doorNo, String streetName, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.pincode = pincode;
	}
}

public class HasADemo {
	public static void main(String[] args) {
		Address addr = new Address(123, "BTM", 630008);
		Employee2 emp = new Employee2(1,"Sachin", "hr", addr);
		emp.displayEmployeeDetails();
		System.out.println();
		
		Employee2 emp2 = new Employee2(2, "Rahul", "Developer", new Address(134,"hsr", 877676));
		emp2.displayEmployeeDetails();
	}

}
