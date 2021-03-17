package day10;

import java.util.*;
import java.util.stream.Collectors;

class WWE {
	private String firstName;
	private String lastName;
	int weight;
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "WWE [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}
}

public class WWEWrestlerImplementation {
	static List<String> printFirstName(ArrayList<WWE> list) {
		System.out.println("First Names:");
		return list.stream().map(w->w.getFirstName()).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		ArrayList<WWE> alist = new ArrayList<WWE>();
		alist.add(new WWE("Person1","Name1",150));
		alist.add(new WWE("Person2","Name2",250));
		alist.add(new WWE("Person3","Name3",275));
		
		System.out.println("Count: "+alist.stream().count());
		System.out.println("Sum: "+alist.stream().filter(s->s.getWeight()>200).mapToInt(s->s.getWeight()).sum());
		System.out.println(printFirstName(alist));
	}

}
