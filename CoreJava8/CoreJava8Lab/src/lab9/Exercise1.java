package lab9;

import java.util.*;

@FunctionalInterface
interface lambdaFunc {
	double powerFunc(double x, double y);
}

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		lambdaFunc l1 = (x,y) -> Math.pow(x,y);
		System.out.println("Enter x, y:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(l1.powerFunc(x, y));
		sc.close();

	}

}
