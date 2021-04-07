package lab1;
import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loopControl = true;
		while(loopControl) {
			System.out.println("1. Red\n2. Yellow\n3. Green\n4. Exit\nEnter your choice: ");
			int choice= sc.nextInt();
			System.out.println("===============");
			switch(choice) {
			case 1:
				System.out.println("Stop");
				break;
			case 2:
				System.out.println("Ready");
				break;
			case 3:
				System.out.println("Go");
				break;
			case 4:
				System.out.println("Thank You.");
				loopControl = false;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("===============");
		}
		sc.close();
	}
}
