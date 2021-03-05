package day3.oops;

class A {
	void disp1() {
		System.out.println("I am A Class");
	}
}

class B extends A {
	void disp2() {
		System.out.println("I am B Class");
	}
}

class C extends B {
	void disp3() {
		System.out.println("I am C Class");
	}
}


public class InheritanceDemo2 {

	public static void main(String[] args) {
		C cObj = new C();
		cObj.disp1();
		cObj.disp2();
		cObj.disp3();
	}

}
