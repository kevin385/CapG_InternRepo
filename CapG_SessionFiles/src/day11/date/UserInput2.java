package day11.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class UserInput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter joining date: ");
		String joiningDate = sc.nextLine();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate myJoiningDate = LocalDate.parse(joiningDate, dtf);
		
		System.out.println("My Joining Date: "+myJoiningDate.format(dtf));
		sc.close();
	}

}
