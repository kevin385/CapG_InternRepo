package day5;

class SavingsAccount {
	private int balance, interest;
	public SavingsAccount(int balance, int interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	public void withdraw(int amount) {
		balance -= amount;
		System.out.println("Balance: "+balance);
	}
	public void deposit(int amount) {
		balance += amount;
		System.out.println("Balance: "+balance);
	}
	public void interest() {
		int interestAmt = balance*(interest/100);
		System.out.println("Interest: "+interestAmt);
		balance += interestAmt;
		System.out.println("Balance: "+balance);
	}
}

public class Task2 {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(10000, 5);
		System.out.println("Balance: "+sa.getBalance());
		sa.deposit(2000);
		sa.interest();
	}

}
