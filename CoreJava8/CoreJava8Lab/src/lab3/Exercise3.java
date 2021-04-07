package lab3;

import java.util.*;

public class Exercise3 {

	String alterString(String str) {
		StringBuffer str1 = new StringBuffer(str);
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				continue;
			}
			else {
				++c;
				str1.replace(i, i+1, Character.toString(c));
			}
		}
		return str1.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise3 ex = new Exercise3();
		System.out.println("Enter String: ");
		System.out.println(ex.alterString(sc.next()));

	}

}
