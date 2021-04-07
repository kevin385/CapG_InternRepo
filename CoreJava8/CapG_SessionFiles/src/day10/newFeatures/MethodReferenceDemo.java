package day10.newFeatures;

//::

@FunctionalInterface
interface Test {
	void display();
}

class MyDemo {
	void method1 () {
		System.out.println("This is method1");
	}
}

class MyDemo2 {
	static void method2() {
		System.out.println("This is method2 static");
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		Test t = () -> System.out.println("Hello");	//through lambda
		
		MyDemo d = new MyDemo();
		Test t2 = d::method1;		//through method reference thru non static
		
		Test t3 = MyDemo2::method2;
		
		t.display();
		t2.display();
		t3.display();
	}

}
