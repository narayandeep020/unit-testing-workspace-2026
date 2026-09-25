package com.feature.datetime_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {

		// Using now() to get the current time
		LocalTime now = LocalTime.now();
		System.out.println("Time: " + now);

		// Set time manually using of() method
		LocalTime time = LocalTime.of(10, 43, 12);
		System.out.println("Custom Time: : " + time);
		System.out.println("-------------------------");

		// Using minusHours() and minusMinutes() Methods
		LocalTime t1 = time.minusHours(2);
		LocalTime t2 = time.minusMinutes(13);
		System.out.println("Minus Hour: " + t1 + "\nMinue Minutes: " + t2);
		LocalTime t3 = time.plusHours(4);
		LocalTime t4 = time.plusMinutes(18);
		System.out.println("Plus Hour: " + t3 + "\nPlus Minutes: " + t4);
		System.out.println("-------------------------");

		// Using atDate() Method
		LocalDate date1 = LocalDate.of(2016, 1, 13);
		LocalDateTime dateTime = time.atDate(date1);
		System.out.println("Date with Time: " + dateTime);
		System.out.println("-----------------------------");

		// Working with Different Time Zones
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		ZoneId zone2 = ZoneId.of("Asia/Tokyo");
		LocalTime time1 = LocalTime.now(zone1);
		LocalTime time2 = LocalTime.now(zone2);
		System.out.println("India time zone: " + time1);
		System.out.println("Japan time zone: " + time2);

		// Using ChronoUnit for time difference
		long hour = ChronoUnit.HOURS.between(time1, time2);
		long minute = ChronoUnit.MINUTES.between(time1, time2);
		System.out.println("Difference in hours: " + hour);
		System.out.println("Difference in minutes: " + minute);
	}
}
