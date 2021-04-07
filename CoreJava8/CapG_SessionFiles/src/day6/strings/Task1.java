package day6.strings;

public class Task1 {

	public static void main(String[] args) {
		String str = "hello";
		String rstr = "";
		for (int i=(str.length()-1); i>=0; i--) {
			rstr += str.charAt(i);
		}
		System.out.println(rstr);
	}

}
