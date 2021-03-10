package day7.regex;

import java.util.regex.*;

public class RegexDemo2 {

	public static void main(String[] args) {
		String myString = "hello123@JAVA";
		System.out.println("String: "+myString);
		System.out.println("=======looks for a b c======");
		Matcher m1 = Pattern.compile("[abc]").matcher(myString);
	
		while(m1.find()) {
			System.out.println(m1.start() +" "+ m1.end() + " "+ m1.group());
		}
		
		System.out.println("========except a b c=====");
		Matcher m2 = Pattern.compile("[^abc]").matcher(myString);
		while(m2.find()) {
			System.out.println(m2.start() +" "+ m2.end() + " "+ m2.group());
		}
		
		System.out.println("========[a-z]=======");
		Matcher m3 = Pattern.compile("[a-z]").matcher(myString);
		while(m3.find()) {
			System.out.println(m3.start() +" "+ m3.end() + " "+ m3.group());
		}
	
		System.out.println("=======digits=======");
		Matcher m4 = Pattern.compile("\\d").matcher(myString);
		while(m4.find()) {
			System.out.println(m4.start() +" "+ m4.end() + " "+ m4.group());
		}
		
		System.out.println("========any word, no special char=======");
		Matcher m5 = Pattern.compile("\\w").matcher(myString);
		while(m5.find()) {
			System.out.println(m5.start() +" "+ m5.end() + " "+ m5.group());
		}
		
		System.out.println("========any word, including special char=======");
		Matcher m6 = Pattern.compile(".").matcher(myString);
		while(m6.find()) {
			System.out.println(m6.start() +" "+ m6.end() + " "+ m6.group());
		}
	}

}
