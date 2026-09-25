package com.feature.datetime_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class MonthEnumExample {

	public static void main(String[] args) {

		// Using valueOf() Method
		Month month = Month.valueOf("January".toUpperCase());
		System.out.printf("For the month of %s all Sunday are:%n", month);

		LocalDate localdate = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		Month month1 = localdate.getMonth();
		while (month1 == month) {
			System.out.printf("%s%n", localdate);
			localdate = localdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
			month1 = localdate.getMonth();
		}

		// Using getValue() Method
		System.out.println(month.getValue());
		System.out.println(month);

		// Using minus() Method
		System.out.println(month.minus(2));

		// Using plus() Method
		System.out.println(month.plus(2));

		// Using length() Method
		System.out.println("Total number of days: " + month.length(true));
	}
}
