package day7.collections;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList o = new ArrayList();
		o.add(1);	//internally it will do autoboxing
		o.add("sachin");
		o.add("ravi");
		o.add('c');
		o.add(10.24);
		o.add(null);
		
		System.out.println("Size after adding: "+o.size());
		System.out.println("Elements: "+o);
		
		o.add(2, "hello");
		System.out.println("Size after adding: "+o.size());
		System.out.println("After adding: "+o);
		
		o.set(4, "welcome");
		System.out.println("Size after setting: "+o.size());
		System.out.println("After setting: "+o);
		
		o.remove("ravi");
		System.out.println("Size after removing: "+o.size());
		System.out.println("After adding: "+o);
		
		o.remove(1);		//takes index
		System.out.println("Size after removing: "+o.size());
		System.out.println("After removing: "+o);
		
		o.remove(Integer.valueOf(1));		//takes value 1
		System.out.println("Size after removing: "+o.size());
		System.out.println("After removing: "+o);
		
		System.out.println(o.contains("hello"));
	
		System.out.println("Get the element by index 2: "+o.get(2));
		
		o.clear();
		System.out.println("Size after clearing: "+o.size());
		System.out.println("After clearing: "+o);
		
		
	}

}
