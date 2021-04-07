package lab6;

import java.util.*;

public class Exercise3 {
	Map<Integer, Integer> getSquares(int arr[]) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i: arr) {
			hm.put(i, i*i);
		}
		return hm;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise3 ex = new Exercise3();
		System.out.println("Enter Size: ");
		int n = sc.nextInt();
		System.out.println("Enter Elements: ");
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(ex.getSquares(arr));
		sc.close();
	}

}
