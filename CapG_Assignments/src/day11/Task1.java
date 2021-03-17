package day11;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter birth date: ");
		LocalDate today = LocalDate.now();
		String birthDay = sc.nextLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate birthDate = LocalDate.parse(birthDay,dtf);
		
		Period age = Period.between(birthDate, today);
		System.out.println(age.getYears()+" Years "+age.getMonths()+" Months "+age.getDays()+" Days");
		sc.close();
	}

}
