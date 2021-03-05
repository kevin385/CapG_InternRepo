package day2.oops;

class Employee{
	int id;
	String name;
	
	Employee(){
		System.out.println("Object Created");
		id = 1;
		name = "sachin";
	}
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void displayEmployeeDetails()
	{
		System.out.println("id "+id);
		System.out.println("name "+name);
	}
}

public class DefaultConstructer {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.displayEmployeeDetails();
		
		Employee e2 = new Employee(2, "Rahul");
		e2.displayEmployeeDetails();
	}
}
