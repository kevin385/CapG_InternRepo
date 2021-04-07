package day11.date;

import java.time.*;
import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date: ");	//default format: yyyy-mm-dd
		String joiningDate = sc.next();
		System.out.println(joiningDate);
		
		LocalDate ld = LocalDate.parse(joiningDate);
		System.out.println("date: "+ld);
		System.out.println("Year: "+ld.getDayOfYear());
		sc.close();
	}

}
