package day10.Date;

import java.time.*;

public class DateDemo1 {

	public static void main(String[] args) {

		System.out.println("Todays date: "+LocalDate.now());
		System.out.println("Joining date: "+LocalDate.of(2019, 4, 7));
		System.out.println("Date with time: "+LocalDateTime.now());
		
		LocalDate today = LocalDate.now();
		System.out.println("Today date is "+today);
		System.out.println("Day of the month: "+today.getDayOfMonth());
		System.out.println("Day of the Year: "+today.getDayOfYear());
		System.out.println("Day of the Week: "+today.getDayOfWeek());
		
		System.out.println("Month: "+today.getMonthValue());
		System.out.println("Month: "+today.getMonth());

	
	
	}

}
