package day10.multithreading;

public class AnonymousClass {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
				for (int i=1;i<=10;i++) {
					if(i == 3) {
						try {
							sleep(5000);
						}
						catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					System.out.println("Task1: "+i);
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for (int i=20;i<=30;i++) {
					System.out.println("Task2: "+i);
				}
			}
		};
		
		Runnable t3 = new Runnable() {
			public void run() {
				for (int i=40;i<=50;i++) {
					System.out.println("Task3: "+i);
				}
			}
		};
		
		t1.start();
		t2.start();
		
		Thread t3Thread = new Thread(t3);
		t3Thread.start();
	}

}
