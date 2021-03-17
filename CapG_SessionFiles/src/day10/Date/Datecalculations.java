package day10.Date;

import java.time.LocalDate;

public class Datecalculations {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println("Today is: "+today);
		
		System.out.println("=======plus=======");
		System.out.println("Tomorrow is: "+today.plusDays(1));
		System.out.println("Day after Tomorrow is: "+today.plusDays(2));
		System.out.println("Next Week is: "+today.plusWeeks(1));
		System.out.println("Next Year is: "+today.plusYears(1));
	
		System.out.println("=====minus=====");
		System.out.println("Yesterday: "+today.minusDays(1));
		System.out.println("Day before Yesterday is: "+today.minusDays(2));
		System.out.println("Last Week is: "+today.minusWeeks(1));
		System.out.println("Last 2 Year is: "+today.minusYears(2));
	
	}

}
