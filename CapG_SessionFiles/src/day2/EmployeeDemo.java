package day2;

class Employee{
	int id;
	String name;
	static String companyName="abc pvt ltd";
}


public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.id=100;
		emp1.name="Sachin";
		
		Employee emp2 = new Employee();
		emp2.id=101;
		emp2.name="Rahul";
		emp2.companyName="TCS";
	
		System.out.println(emp1.id +" "+emp1.name+" "+emp1.companyName);
		System.out.println(emp2.id +" "+emp2.name+" "+emp2.companyName);
	}
}
