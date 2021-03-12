package day9;

import java.util.*;

public class Question6 {

	public String repeatFront(String str, int n) {
		String res = "";
		while(n>0) {
			res += str.substring(0, n--);
		}
		return res;
	}
	public static void main(String[] args) {
		Question6 ob = new Question6();
		Scanner sc = new Scanner(System.in);
		String str;
		int n;
		System.out.println("Enter String and n:");
		str = sc.nextLine();
		n = sc.nextInt();
		String res = ob.repeatFront(str, n);
		System.out.println("Result: "+res);
		sc.close();
	}

}
