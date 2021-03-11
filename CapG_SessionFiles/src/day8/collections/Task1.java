package day8.collections;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> project1names = new ArrayList<String>();
		project1names.add("sachin");
		project1names.add("rahul");
		project1names.add("amit");
		project1names.add("kumar");
		
		ArrayList<String> project2names = new ArrayList<String>();
		project2names.add("roshan");
		project2names.add("varsha");
		project2names.add("rahul");
		project2names.add("amit");
		project2names.add("harshit");
		
		System.out.println("Project 1:"+project1names);
		project2names.removeAll(project1names);
		System.out.println("Project 2:"+project2names);
		
		
		
	}

}
