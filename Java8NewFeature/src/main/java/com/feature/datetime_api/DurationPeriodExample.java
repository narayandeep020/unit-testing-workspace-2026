package com.feature.datetime_api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class DurationPeriodExample {

	public static void main(String[] args) {

		// Create a Duration of 5 hours and 30 minutes
		Duration d1 = Duration.ofHours(5).plusMinutes(30);
		System.out.println("Duration: " + d1);

		// Calculate the duration between two LocalTime instances
		LocalTime startTime = LocalTime.of(10, 30);
		LocalTime endTime = LocalTime.of(14, 45);
		Duration d2 = Duration.between(startTime, endTime);
		System.out.println("Duration: " + d2);
		System.out.println("----------------------------------");

		// Using get() and between() Method in Duration
		Duration d3 = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println("Duration between NOON and MAX in second: " + d3.get(ChronoUnit.SECONDS));

		Duration d4 = Duration.between(LocalTime.MAX, LocalTime.NOON);
		Duration d5 = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println("MAX between NOON: " + d4.isNegative() + "\nNOON between MAX: " + d5.isNegative());
		System.out.println("----------------------------------");

		// Using minus() and plus() method
		Duration d6 = d3.minusSeconds(199);
		System.out.println("d3 value minus 199 second: " + d6.getSeconds());

		Duration d7 = d3.plus(d3);
		System.out.println("d3 value plus d3 value: " + d7.getSeconds());
		System.out.println("----------------------------------");

		// Create a Period of 2 years, 3 months, and 5 days using of() method
		Period period = Period.of(2, 3, 5);
		System.out.println("Period: " + period);

		// Calculate the period between two LocalDate instances
		LocalDate startDate = LocalDate.of(2001, 8, 04);
		LocalDate endDate = LocalDate.of(2004, 7, 8);
		Period p1 = Period.between(startDate, endDate);
		System.out.println("Period: " + p1);
		System.out.println("----------------------------------");

		// Using addTo() and ofDays() Method
		Period p2 = Period.ofDays(24);
		Temporal temp = p2.addTo(LocalDate.now());
		System.out.println("Custome Day: " + temp);

		// Using minus() and plus() Method
		Period p3 = Period.ofMonths(4);
		Period p4 = p3.minus(Period.ofMonths(2));
		System.out.println("Minus Month: " + p4);
		Period p5 = p3.plus(Period.ofMonths(2));
		System.out.println("Plus Month: " + p5);
		System.out.println("----------------------------------");

		// Getting and Formatting Current Date
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatDateTime = now.format(f1);
		System.out.println("After Fomatting: " + formatDateTime);
		System.out.println("----------------------------------");

		// LocalDateTime.minusDays() Method
		LocalDateTime datetime1 = LocalDateTime.of(2026, 6, 11, 21, 35);
		LocalDateTime datetime2 = datetime1.minusDays(200);
		System.out.println("Before Formatting: " + datetime2);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String formatDT = datetime2.format(format);
		System.out.println("After Formatting: " + formatDT);
		System.out.println("----------------------------------");

	}

}
