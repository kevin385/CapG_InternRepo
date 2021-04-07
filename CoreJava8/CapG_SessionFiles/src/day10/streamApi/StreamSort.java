package day10.streamApi;

import java.util.ArrayList;

public class StreamSort {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1, "sachin", "hr", 45000, 32));
		emplist.add(new Employee(2, "ravi", "developer", 85000, 32));
		emplist.add(new Employee(3, "kumar", "developer", 50000, 33));
		emplist.add(new Employee(4, "rahul", "hr", 25000, 26));
		emplist.add(new Employee(5, "manish", "manager", 90000, 32));
		
		emplist.forEach(s->System.out.println(s));
		
		//Comparator<Employee> nameComparator = (e1,e2)->e1.getName().compareTo(e2.getName());
		
		/*Comparator<Employee> idComparator = (e1,e2) ->
		{
			if(e1.getId()==e2.getId())
				return 0;
			else if(e1.getId()>e2.getId())
				return -1;
			return 1;
		};*/
		
	}

}
