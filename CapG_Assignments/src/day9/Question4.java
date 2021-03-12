package day9;

import java.util.*;

public class Question4 {
	
	public String mixString(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		String res = "";
		int count = 0;
		if (aLen <= bLen) {
			for(int i=0; i<aLen; i++) {
				res += a.charAt(i);
				res += b.charAt(i);
			}
			res += b.substring(aLen);
		}
		else {
			for(int i=0; i<bLen; i++) {
				res += a.charAt(i);
				res += b.charAt(i);
			}
			res += a.substring(bLen);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Question4 ob = new Question4();
		Scanner sc = new Scanner(System.in);
		String a, b, res;
		System.out.println("Enter String a and b:");
		a = sc.next();
		b = sc.next();
		res = ob.mixString(a, b);
		System.out.println("Result: "+res);
	}

}
