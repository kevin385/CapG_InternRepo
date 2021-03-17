package lab6;

import java.util.*;

public class Exercise2 {
	public Map<Character, Integer> countChars(char[] arr) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char ch: arr){
			if (charCount.containsKey(ch)) {
				charCount.replace(ch, charCount.get(ch)+1);
			}
			else {
				charCount.put(ch, 1);
			}
		}
		return charCount;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise2 ex = new Exercise2();
		char[] str = new char[100];
		System.out.println("Enter char array elements: ");
		str = sc.next().toCharArray();
		System.out.println(ex.countChars(str));
		sc.close();
	}

}
