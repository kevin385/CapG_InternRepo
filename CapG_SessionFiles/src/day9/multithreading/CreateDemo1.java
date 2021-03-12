package day9.multithreading;

class A extends Thread {
	public void run() {
		System.out.println("THis is my task");
	}
}

class B implements Runnable {
	public void run() {
		System.out.println("This is my task--- created using Runnable interface");
	}
}

public class CreateDemo1 {

	public static void main(String[] args) {
		A o = new A();
		o.start();
		
		B o1 = new B();
		Thread t1 = new Thread(o1);
		t1.start();

	}

}
