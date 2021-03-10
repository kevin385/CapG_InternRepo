package day6.strings;

public class Task2 {

	public static void main(String[] args) {
		String str = "hello";
		String str1 = "";
		for (int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				continue;
			}
			else {
				str1 += c;
			}
		}
		System.out.println(str1);
	}

}
