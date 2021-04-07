package day8.collections;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> evenArray = new ArrayList<Integer>();
		System.out.println("Enter 10 numbers: ");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<10; i++) {
			int n = sc.nextInt();
			if (n%2 == 0) {
				evenArray.add(n);
			}
		}
		System.out.println(evenArray);
		sc.close();
	}

}
