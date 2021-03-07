package day4.oops;

class Person3 {
	void sleep() {
		System.out.println("Sleep for 8Hrs");
	}
	void work() {
		System.out.println("Work for 8Hrs");
	}
}

class Employee3 extends Person3 {
	void work() {
		System.out.println("Work for 9Hrs");
	}
	void display() {
		System.out.println("This is display. Not Overriding");
	}
}

public class Overriding3 {

	public static void main(String[] args) {
		Person3 person = new Employee3();	//Will call only overridden methods from child class
		person.sleep();
		person.work();
		//person.display();	//Not present in Parent Class 

	}

}
