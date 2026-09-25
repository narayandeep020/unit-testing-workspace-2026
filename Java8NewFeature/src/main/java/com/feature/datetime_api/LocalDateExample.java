package com.feature.datetime_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {

		// Using now() to get the current date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date: " + today);

		// Set date manually using of() method
		LocalDate birthday = LocalDate.of(1990, Month.MAY, 15);
		System.out.println("Birthday: " + birthday);
		System.out.println("-----------------------------");

		// Parsing the date from the string
		String dateString = "2024-03-22";
		LocalDate parseDate = LocalDate.parse(dateString);
		System.out.println("String to LocalDate : " + parseDate);
		System.out.println("-----------------------------");

		// Providing year, month, and day directly
		int year = 2026;
		int month = 8;
		int dayOfMonth = 20;
		LocalDate customDate = LocalDate.of(year, month, dayOfMonth);
		System.out.println("Custom Date: " + customDate);
		System.out.println("-----------------------------");

		// Use of the now(), minusDays(), and plusDays() methods
		LocalDate current = LocalDate.now();
		LocalDate yesterday = current.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println("Current Date: " + current);
		System.out.println("Yesterday Date: " + yesterday);
		System.out.println("Tomorrow Date: " + tomorrow);
		System.out.println("-----------------------------");

		// Use of the isLeapYear() methods
		LocalDate date1 = LocalDate.of(2016, 1, 13);
		System.out.println("Is Leap Year: " + date1.isLeapYear());
		System.out.println("-----------------------------");

		// Using atTime() Method
		LocalDate date = LocalDate.of(2016, 01, 10);
		LocalDateTime dateTime = date.atTime(1, 17, 26);
		System.out.println("Date with Time"+dateTime);
		System.out.println("-----------------------------");

		// Using format() Method
		LocalDate d1 = LocalDate.now();
		String d1str = d1.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Date1 in string: " + d1str);

		LocalDate d2 = LocalDate.of(2002, 05, 01);
		String d2Str = d2.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Date2 in string :  " + d2Str);
		System.out.println("-----------------------------");

		// Using compareTo method
		LocalDate comDate = LocalDate.of(2008, 12, 14);
		int compare = comDate.compareTo(d2);
		System.out.println("Compare to :  " + compare);
		System.out.println("-----------------------------");

		LocalDate localDate = LocalDate.of(2008, 12, 14);
		int hi = localDate.getDayOfMonth();
		int hi1 = localDate.getDayOfYear();
		int hi2 = localDate.getMonthValue();
		int hi3 = localDate.getYear();
		int hi6 = localDate.lengthOfMonth();
		int hi7 = localDate.lengthOfYear();
		System.out.println("Actual Date: " + localDate);
		System.out.println("DayOfMonth: " + hi + "\nDayOfYear: " + hi1 + "\nMonthValue: " + hi2 + "\nYear: " + hi3
				+ "\nlengthOfMonth: " + hi6 + "\nlengthOfYear: " + hi7);

		System.out.println("-----------------------------");
		DayOfWeek hi4 = localDate.getDayOfWeek();
		IsoChronology hi5 = localDate.getChronology();
		System.out.println("DayOfWeek: " + hi4);
		System.out.println("Chronology: " + hi5);

	}
}
