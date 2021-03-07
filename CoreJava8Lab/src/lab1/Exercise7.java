package lab1;
import java.util.*;

public class Exercise7 {
	boolean checkNumber (int number) {
		String numberS = String.valueOf(number);
		for (int i = 1; i < numberS.length(); i++) {
			if (numberS.charAt(i) < numberS.charAt(i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise7 exercise7 = new Exercise7();
		int number;
		boolean result;
		System.out.println("Enter Number: ");
		number = sc.nextInt();
		result = exercise7.checkNumber(number);
		if(result) {
			System.out.println("Number is Increasing.");
		}
		else {
			System.out.println("Number is not Increasing.");
		}
		sc.close();
	}
}
