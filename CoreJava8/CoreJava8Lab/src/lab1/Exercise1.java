package lab1;

import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, num, sum = 0;
		System.out.println("Enter number: ");
		n = sc.nextInt();
		num = n;
		while(num > 0) {
			sum += Math.pow(num%10, 3);
			num /= 10;
		}
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
