package com.feature.datetime_api;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentDateTime);

		// Create a specific date and time
		LocalDateTime specificDateTime = LocalDateTime.of(2026, Month.MARCH, 12, 11, 20);
		System.out.println("Specific Date and Time: " + specificDateTime);
		System.out.println("----------------------------------");

		// Adding and Removing Time Units
		LocalDateTime specificDT = LocalDateTime.of(2026, Month.MARCH, 9, 23, 12);
		System.out.println("Original Date and Time: " + specificDT);
		LocalDateTime futureDT = specificDT.plusDays(4).minusHours(2).plusMinutes(15);
		System.out.println("Modified Date and Time: " + futureDT);
		System.out.println("----------------------------------");

		// Setting Specific Fields
		System.out.println("Real Date and Time: " + specificDT);
		LocalDateTime modifiedDateTime = specificDT.withYear(2026).withMonth(Month.APRIL.getValue()).withDayOfMonth(11)
				.withHour(12).withMinute(13);
		System.out.println("Update Date and Time: " + modifiedDateTime);
		System.out.println("----------------------------------");

		// Formatting LocalDateTime to String
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);
		System.out.println("Formatted Date and Time: " + formattedDateTime);

		// Define a string with date and time information
		String dateString = "2026-06-12 09:30:00";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter1);
		System.out.println("Parsed Date and Time: " + parsedDateTime);
		System.out.println("----------------------------------");

		// Using LocalDateTime get() method
		LocalDateTime a = LocalDateTime.of(2026, 7, 24, 2, 35);
		System.out.println(a.get(ChronoField.DAY_OF_WEEK));
		System.out.println(a.get(ChronoField.DAY_OF_MONTH));
		System.out.println(a.get(ChronoField.DAY_OF_YEAR));
		System.out.println(a.get(ChronoField.HOUR_OF_DAY));
		System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
		System.out.println("----------------------------------");

	}
}
