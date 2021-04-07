package lab1;

import java.util.Scanner;

public class Exercise8 {
	public  boolean checkNumber(int n)
	{
		while(n > 1) {
			if(n%2 == 0)
				n = n/2;
			else
				return false;
		}
		return true;
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise8 exercise8 = new Exercise8();
		System.out.println("Enter number");
		int number = sc.nextInt();
		boolean result = exercise8.checkNumber(number);
		if(result)
			System.out.println("Power of 2.");
		else
			System.out.println("Not a power of 2.");
		sc.close();
	}

}
