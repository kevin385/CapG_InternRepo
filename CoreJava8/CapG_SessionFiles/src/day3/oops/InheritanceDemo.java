package day3.oops;

class Person {
	int id;
	String name;
	int age;
}

class Cricketer extends Person {
	String role;
	void displayDetails() {
		System.out.println("================");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Role: "+role);
		System.out.println("================");
	}
}

class Student extends Person {
	String dept;
	void displayDetails() {
		System.out.println("================");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Department: "+dept);
		System.out.println("================");
	}
}

class Manager extends Person {
	int experience;
}


public class InheritanceDemo {

	public static void main(String[] args) {
		Cricketer cricketer = new Cricketer();
		cricketer.id = 1;
		cricketer.name = "Sachin";
		cricketer.age = 26;
		cricketer.role = "Batsman";
		cricketer.displayDetails();
	}

}
