package day3.oops;

class Account {
	void minBalance () {
		System.out.println("Min Balance not set");
	}
}

class Savings extends Account {
	void minBalance() {
		System.out.println("10000");
	}
}

class Current extends Account {
	void minBalance() {
		System.out.println("25000");
	}
}

public class UpcastingDemo2 {

	public static void main(String[] args) {
		Account account = new Savings();
		account.minBalance();
		
		Account account2 = new Current();
		account2.minBalance();

	}

}
