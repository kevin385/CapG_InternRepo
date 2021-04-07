package lab6;

import java.util.*;

public class Exercise4 {
	HashMap<Integer, String> getStudents(HashMap<Integer, Integer> studentList) { 
		HashMap<Integer, String> medalList = new HashMap<Integer, String>();
		for (Map.Entry<Integer, Integer> e: studentList.entrySet()) {
			if(e.getValue() >= 90)
				medalList.put(e.getKey(), "Gold");
			else if(e.getValue() >= 80 && e.getValue() < 90)
				medalList.put(e.getKey(), "Silver");
			else if(e.getValue() >= 70 && e.getValue() < 80)
				medalList.put(e.getKey(), "Bronze");
		}
		return medalList;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise4 ex = new Exercise4();
		int n, marks, id;
		System.out.println("Enter no. of student: ");
		n = sc.nextInt();
		HashMap<Integer, Integer> studentList = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			System.out.println("Enter Student "+(i+1)+" id and marks: ");
			id = sc.nextInt();
			marks = sc.nextInt();
			studentList.put(id, marks);
		}
		System.out.println(ex.getStudents(studentList));
		sc.close();
	}

}
