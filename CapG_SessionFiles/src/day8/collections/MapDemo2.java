package day8.collections;

import java.util.*;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("bumrah", "bumrah is a bowler");
		hm.put("sachin", "sachin is a batsman");
		hm.put("rahul", "rahul is a wicket keeper");
		System.out.println("HashMap: "+hm);
		
		hm.replace("sachin", "retired");
		hm.put("rahul", "rahul is a mentor");
		System.out.println("HashMap after replace: "+hm);
		
		hm.remove("bumrah");
		System.out.println("HashMap after remove: "+hm);

	}

}
