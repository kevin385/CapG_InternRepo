package lab4;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Account {
	private long accNum;
	private double balance = 500;
	private Person accHolder;
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amt) {
		balance += amt;
	}
	public void withdraw(double amt) {
		balance -= amt;
	}
}

class SavingsAccount extends Account{
	private final double minimumBalance = 500;
	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
	}
	public void withdraw(double amt) {
		if (getBalance() >= minimumBalance) {
			setBalance(getBalance()-amt);
		}
		else {
			System.out.println("Minimum Balance not kept.");
		}
	}
}

class CurrentAccount extends Account{
	private double overdraftLimit;
	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
	}
	public void withdraw(double amt) {
		if (amt > overdraftLimit) {
			System.out.println("Limit reached");
		}
		else {
			System.out.println("Limit not reached");
		}
	}
	
}

public class Exercise1 {
	public static void main(String[] args) {
		long accNo = 10000;
		Person p1 = new Person("Smith",45);
		Person p2 = new Person("Kathy",36);
		Account ac1 = new Account(++accNo, 2000, p1);
		Account ac2 = new Account(++accNo, 3000, p2);
		ac1.deposit(2000);
		ac2.withdraw(2000);
		System.out.println("Acc Number: "+ac1.getAccNum()+"\nUpdated Balance: "+ac1.getBalance());
		System.out.println("Acc Number: "+ac2.getAccNum()+"\nUpdated Balance: "+ac2.getBalance());
		
	}

}
