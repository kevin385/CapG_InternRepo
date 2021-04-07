package lab9;

import java.util.*;

@FunctionalInterface
interface LambdaClass {
	String stringSpace(String str);
}

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LambdaClass l1 = (str) -> {
			String str1 = "";
			for(char ch: str.toCharArray()) {
				str1 += ch;
				str1 += ' ';
			}
			return str1;
		};
		System.out.println("Enter String: ");
		String str = sc.next();
		System.out.println(l1.stringSpace(str));
		sc.close();
	}

}
