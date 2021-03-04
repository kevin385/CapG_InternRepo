package Day2;
import java.util.*;
public class Bank {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int balance = 6000;
		while(true) {
			System.out.println("1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit\nEnter choice: ");
			int choice = scanner.nextInt();
			if(choice == 1) {
				System.out.println("Withdrawal");
				System.out.println("Enter amount: ");
				int amount = scanner.nextInt();
				if(amount > balance) {
					System.out.println("Insufficient Balance");
				}
				else {
				balance -= amount; 
				}
			}
			else if(choice == 2) {
				System.out.println("Deposit");
				System.out.println("Enter amount: ");
				int amount = scanner.nextInt();
				balance += amount;
			}
			else if(choice == 3) {
				System.out.println("Balance: "+balance);
			}
			else if(choice == 4) {
				System.out.println("Thank You");
				break;
			}
			else {
				System.out.println("Invalid option");
			}
		}
		scanner.close();
	}
}

