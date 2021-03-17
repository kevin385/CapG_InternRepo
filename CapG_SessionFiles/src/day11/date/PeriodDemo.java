package day11.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate trainingStartDate = LocalDate.of(2021, 3, 1);
		Period p = Period.between(trainingStartDate, today);
		System.out.println(p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days");

	}

}
