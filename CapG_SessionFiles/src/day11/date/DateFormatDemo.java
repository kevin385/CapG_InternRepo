package day11.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatDemo {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy MMM dd");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy MMM dd, E, W, M, w");
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		LocalDate today = LocalDate.now();
		System.out.println("Date: "+today);
		
		String date1 = today.format(dtf);
		System.out.println("After format: "+date1);
		
		String date2 = today.format(dtf2);
		System.out.println("After format: "+date2);
		
		String date3 = today.format(dtf3);
		System.out.println("After format: "+date3);
	
		String date4 = today.format(dtf4);
		System.out.println("After format: "+date4);
	
		System.out.println("Using inbuilt function");
		String date5 = today.format(f1);
		System.out.println("Format Full: "+date5);
		String date6 = today.format(f2);
		System.out.println("Format Long: "+date6);
		String date7 = today.format(f3);
		System.out.println("Format Medium: "+date7);
		String date8 = today.format(f4);
		System.out.println("Format Short: "+date8);
	}

}
