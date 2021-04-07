package day3.oops;

class Parent1 {
	int id;
	String name;
	Parent1(int id) {
		System.out.println("This is Parent Constructor of type int");
		System.out.println("ID: "+id);
	}
	Parent1(String name) {
		System.out.println("This is Parent Constructor of type String");
		System.out.println("Name: "+name);
	}
}

class Child1 extends Parent1 {
	Child1(int id) {
		super(2);
		System.out.println("This is Child Constructor");
		System.out.println("ID: "+id);
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		new Child1(4);
	}

}
