package day7.regex;

import java.util.regex.*;

public class RegexDemo1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a"); //finds for a
		Pattern p1 = Pattern.compile("[abc]");	//either a or b or c
		
		Matcher m1 = p.matcher("sachin");
		
		while(m1.find()) {
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
	
		System.out.println();
		Matcher m2 = p1.matcher("sachin");
		while(m2.find()) {
			System.out.println(m2.start()+" "+m2.end()+" "+m2.group());
		}
		
	}

}
