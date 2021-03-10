package day6.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "hello";
		
		System.out.println("Length: "+ s1.length());
		System.out.println("Char At 1: "+ s1.charAt(1));
		System.out.println("Char At 4: "+ s1.charAt(4));
		System.out.println("Index of e: "+ s1.indexOf('e'));
		System.out.println("Equals: "+s1.equals("hello"));
		System.out.println("Equals: "+s1.equals("Hello"));
		System.out.println("Equals ignore case: "+s1.equalsIgnoreCase("Hello"));
		System.out.println("Replace: "+s1.replace('l', 'p'));
		System.out.println("Sub String: "+s1.substring(1));
		System.out.println("Sub String: "+s1.substring(1,4));
		
		String s2 = "     Welcome     ";
		System.out.println("s2: "+s2.trim());
		
		char ch[] = s1.toCharArray();
		
		String s3 = "hello welcome java";
		String arr[] = s3.split("\\s");
		for (String s: arr) {
			System.out.print(s);
		}
	}

}
