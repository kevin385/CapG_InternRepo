package day8.collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("bumrah", "bumrah is a bowler");
		hm.put("sachin", "sachin is a batsman");
		hm.put("rahul", "rahul is a wicket keeper");
		
		System.out.println("HashMap: "+hm);
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("sachin", "sachin is a batsman");
		lhm.put("rahul", "rahul is a wicket keeper");
		lhm.put("bumrah", "bumrah is a bowler");
		
		System.out.println("LinkedHashMap: "+lhm);
		
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("sachin", "sachin is a batsman");
		tm.put("rahul", "rahul is a wicket keeper");
		tm.put("bumrah", "bumrah is a bowler");
		
		System.out.println("HashMap: "+tm);
	}

}
