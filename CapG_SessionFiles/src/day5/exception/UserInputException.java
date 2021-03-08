package day5.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		try {
			System.out.println("Enter a Value: ");
			int a = sc.nextInt();
			System.out.println("Enter b Value: ");
			int b = sc.nextInt();
			result = a/b;
		}
		catch (InputMismatchException e) {
			System.out.println("Enter only a number.");
		}
		catch(ArithmeticException e) {
			System.out.println("Do not Enter Zero. "+e);
		}
		System.out.println("Result: "+result);
		sc.close();
	}

}
