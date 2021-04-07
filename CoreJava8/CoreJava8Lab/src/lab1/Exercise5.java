package lab1;
import java.util.*;

public class Exercise5 {
	int calculateSum(int n) {
		int sum = 0;
		for (int i=1; i<=n; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Exercise5 exercise5 = new Exercise5();
		Scanner sc = new Scanner(System.in);
		int n, sum;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		sum = exercise5.calculateSum(n);
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
