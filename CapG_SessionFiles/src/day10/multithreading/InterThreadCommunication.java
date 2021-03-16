package day10.multithreading;

class Account {
	int balance = 5000;
	synchronized void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("Insufficient fund");
			System.out.println("Waiting");
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Withdrawal Complete");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Deposit Started");
		balance += amount;
		notify();		//notifies thread that is put to wait
		System.out.println("Deposit Completed");
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		Account account = new Account();
		
		Thread withdraw = new Thread() {
			public void run() {
				account.withdraw(7000);
			}
		};
		
		withdraw.setName("Withdraw");
		withdraw.start();
		
		Thread deposit = new Thread() {
			public void run() {
				account.deposit(7000);
			}
		};
		
		deposit.setName("Withdraw");
		deposit.start();
	}

}
