package lab1;
import java.util.*;

public class Exercise6 {
	int calculateDifference(int n) {
		int sumOfSquares = 0, sum = 0,squareOfSum;
		for (int i=1; i<=n; i++) {
			sumOfSquares += Math.pow(i, 2);
			sum += i;
		}
		squareOfSum = sum*sum;
		return sumOfSquares - squareOfSum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise6 exercise6 = new Exercise6();
		int n, diff;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		diff = exercise6.calculateDifference(n);
		System.out.println("Difference: "+diff);
		sc.close();
	}

}
