package day18;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringAndRegex {

	public static void main(String[] args) {
		List<String> emails = new ArrayList<String>();
		emails.add("_alpha@example.com");
		emails.add("1123@examply.com");
		emails.add("ABC@example.com");
		emails.add("_@example.com");	//only 1 and nothing else so wont match
		emails.add("_abc@@example.com");
		emails.add("_abc@@examplecom");	// \\.
		String emailMatcher = "^[_a-zA-Z]\\w{1,}@{1}[a-zA-Z]+\\.{1}[a-zA-Z]+$";
		// "^[7-9]{1}[0-9]{9}"
		Pattern emailP = Pattern.compile(emailMatcher);
		for(int i=0; i<emails.size(); i++) {
			Matcher valid = emailP.matcher(emails.get(i));
			if(valid.find()) {
				System.out.println(emails.get(i));
			}
		}
		String phoneMatcher = "^[7-9]{1}[0-9]{9}$";
		Pattern phoneP = Pattern.compile(phoneMatcher);
		
		String str = "9876543210";
		Matcher valid1 = phoneP.matcher(str);
		if(valid1.find()) {
			System.out.println(str);
		}
	}

}
