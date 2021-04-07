package day10.Date;

import java.time.LocalDate;

public class Datecondition {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate bookingDate = LocalDate.of(2021, 3, 2);
		
		boolean t = bookingDate.isAfter(today);
		if(t)
			System.out.println("Correct Booking Date");
		else
			System.out.println("Incorrect Booking date");
	}

}
