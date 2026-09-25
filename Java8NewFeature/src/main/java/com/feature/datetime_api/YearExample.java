package com.feature.datetime_api;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class YearExample {

	public static void main(String[] args) {

		// Using now() method
		Year y1 = Year.now();
		System.out.println("Current Year: " + y1);

		// Using atDay() method
		Year y2 = Year.of(2017);
		LocalDate ld = y2.atDay(123);
		System.out.println("Date: " + ld + "\nLength is: " + y2.length() + "\nIs Leap Year: " + y2.isLeap());

		// Using format() method
		String s1 = ld.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(s1);
	}
}
