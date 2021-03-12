package day9;

import java.util.*;

public class Question5 {
	public String repeatEnd(String str, int n) {
		String endStr = str.substring(str.length()-n), res = "";
		int num = n;
		while (num>0) {
			res += endStr;
			num--;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Question5 ob = new Question5();
		Scanner sc = new Scanner(System.in);
		String str;
		int n;
		System.out.println("Enter String and n:");
		str = sc.nextLine();
		n = sc.nextInt();
		String res = ob.repeatEnd(str, n);
		System.out.println("Result: "+res);
		

	}

}
