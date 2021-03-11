package day8.collections;

import java.util.*;

public class MapIterateDemo {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("bumrah", "bumrah is a bowler");
		hm.put("sachin", "sachin is a batsman");
		hm.put("rahul", "rahul is a wicket keeper");
		
		System.out.println("HashMap: "+hm);
		
		System.out.println("=====================");
		System.out.println("Keys are:");
		for(String key :hm.keySet()) {
			System.out.println(key);
			//System.out.println(" Value in the "+key+" : "+hm.get(key));
		}
		System.out.println("=====================");
		System.out.println("Values are:");
		for (String val: hm.values()) {
			System.out.println(val);
		}
		System.out.println("=====================");
		
		for (Map.Entry<String, String> h: hm.entrySet()) {
			System.out.println(h);
		}
	}

}
