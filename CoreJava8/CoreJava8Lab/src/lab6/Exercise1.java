package lab6;
import java.util.*;
public class Exercise1 {
	public List<String> getValues(HashMap<String, String> hm) {
		List<String> hv = new ArrayList<String>(hm.values());
		Collections.sort(hv);
		return hv;
	}
	
	
	public static void main(String[] args) {
		Exercise1 ex = new Exercise1();
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("rahul", "rahul is a wicket keeper");
		hm.put("bumrah", "bumrah is a bowler");
		hm.put("sachin", "sachin is a batsman");
		System.out.println(ex.getValues(hm));
	}

}
