package lab3;

import java.util.*;

public class Exercise8 {
	public static boolean positiveStringCheck(String str) {
		for(int i=0; i<str.length()-1; i++) {
			if(Character.compare(str.charAt(i), str.charAt(i+1)) > 0) {
				System.out.println(Character.compare(str.charAt(i), str.charAt(i+1)));
				return false;
			}
				
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		System.out.println(positiveStringCheck(str));
		sc.close();
	}

}
