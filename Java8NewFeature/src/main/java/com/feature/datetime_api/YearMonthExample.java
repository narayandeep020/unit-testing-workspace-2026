package com.feature.datetime_api;

import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class YearMonthExample {

	public static void main(String[] args) {

		// Using now() and format() method
		YearMonth ym1 = YearMonth.now();
		String s1 = ym1.format(DateTimeFormatter.ofPattern("MM-yyyy"));
		System.out.println(s1);
		System.out.println("--------------------");

		// Using adjustInto() method
		Temporal temp = ym1.adjustInto(ZonedDateTime.now());
		System.out.println(temp);
		System.out.println("--------------------");

		// Using withYear() method
		YearMonth ym2 = ym1.withYear(1998);
		System.out.println(ym2);

		// Using get() Method
		long l1 = ym1.get(ChronoField.YEAR);
		System.out.println(l1);
		long l2 = ym1.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(l2);
		System.out.println("--------------------");

//		YearMonth y1 = ym1.plusYears(3);
		YearMonth ym3 = ym1.plus(Period.ofYears(3));
		System.out.println(ym3);
//		YearMonth y2 = ym1.minusYears(4);
		YearMonth ym4 = ym1.minus(Period.ofYears(4));
		System.out.println(ym4);
	}
}
