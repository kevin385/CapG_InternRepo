package day9;

class Shape {
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
	void erase() {
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing Triangle");
	}
	void erase() {
		System.out.println("Erasing Triangle");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing Square");
	}
}

public class Question2 {
	public static void main(String[] args) {
		Shape ob1 = new Circle();
		Shape ob2 = new Triangle();
		Shape ob3 = new Square();
		ob1.draw();
		ob1.erase();
		ob2.draw();
		ob2.erase();
		ob3.draw();
		ob3.erase();
	}
}
