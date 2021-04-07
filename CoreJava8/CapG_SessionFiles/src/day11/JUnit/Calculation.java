package day11.JUnit;

public class Calculation {
	int add(int a, int b) {
		int result = 0;
		if (a>=0 & b>=0) {
			result = a+b;
		}
		return result;
	}
	boolean nameTest(String name) {
		return name.startsWith("a");
	}
	
	boolean checkForPalindrome(String str) {
		StringBuffer sb = new StringBuffer(str);
		String reverseString = sb.reverse().toString();
		return reverseString.equals(str);
		
	}
}
