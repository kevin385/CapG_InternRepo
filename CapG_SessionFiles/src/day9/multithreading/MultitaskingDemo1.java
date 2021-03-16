package day9.multithreading;

class MyTask1 extends Thread {
	public void run() {
		System.out.println("This is my task1");
	}
}

public class MultitaskingDemo1 {

	public static void main(String[] args) {
		MyTask1 t1 = new MyTask1();
		t1.start();	//performs multitasking
		//t1.run();	//perform normal call
	}

}
