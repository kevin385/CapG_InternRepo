package day8.collections;

import java.util.*;

public class CollectionsUtility {

	public static void main(String[] args) {
		ArrayList<String> project1 = new ArrayList<String>();
		project1.add("sachin");
		project1.add("rahul");
		project1.add("amit");
		project1.add("kumar");
		
		System.out.println("Project 1: "+project1);
		
		Collections.sort(project1);
		
		System.out.println("Project 1 after Sorting: "+project1);
		
		//Collections.reverse(project1);

		//System.out.println("Project 1 after Reverse: "+project1);
		
		int index = Collections.binarySearch(project1, "sachin");
		System.out.println("Index of sachin: "+index);
		
	}

}
