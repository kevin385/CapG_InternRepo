package day9.multithreading;

class Task1 extends Thread {
	public void run() {	//must be public
		for (int i=1;i<=10;i++) {
			System.out.println("Task1: "+i);
		}
	}
	
}

class Task2 extends Thread {
	public void run() {
		for (int i=20;i<=30;i++) {
			System.out.println("Task2: "+i);
		}
	}
	
}

class Task3 extends Thread {
	public void run() {
		for (int i=40;i<=50;i++) {
			System.out.println("Task3: "+i);
		}
	}
	
}

public class MultitaskingDemo {

	public static void main(String[] args) {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		Task3 t3 = new Task3();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
