package com.feature.datetime_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DayOfWeekExample {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.of(2017, Month.JANUARY, 25);
		DayOfWeek week = DayOfWeek.from(ld);
		System.out.println(week.get(ChronoField.DAY_OF_WEEK));
//		------------------------------------------------------
		DayOfWeek ld2 = DayOfWeek.of(5);
		System.out.println("Name: " + ld2.name());
		System.out.println("Ordinal: " + ld2.ordinal());
		System.out.println("Value: " + ld2.getValue());
//		------------------------------------------------------
		DayOfWeek ld3 = DayOfWeek.from(ld);
		System.out.println(ld3.getValue() + ":" + ld3);
		ld3 = ld3.plus(3);
		System.out.println(ld3.getValue() + ":" + ld3);
//		------------------------------------------------------
		DayOfWeek ld4 = DayOfWeek.from(ld);
		System.out.println(ld4.getValue() + ":" + ld4);
		ld4 = ld4.minus(3);
		System.out.println(ld4.getValue() + ":" + ld4);
//		------------------------------------------------------
		LocalDate localDate = LocalDate.of(2021, Month.SEPTEMBER, 13);
		DayOfWeek week2 = DayOfWeek.from(localDate);
		System.out.println("Day of the Week on" + " 13th September 2021 - " + week2.name());
		int val = week2.getValue();
		System.out.println("Int Value of " + week2.name() + " :- " + val);
	}
}
