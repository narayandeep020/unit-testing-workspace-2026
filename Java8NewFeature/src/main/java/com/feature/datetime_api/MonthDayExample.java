package com.feature.datetime_api;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExample {

	public static void main(String[] args) {

		// Using atYear() Method
		MonthDay md1 = MonthDay.now();
		LocalDate ld1 = md1.atYear(1994);
		System.out.println(ld1);

		// Using isValidYear() Method
		MonthDay month = MonthDay.now();
		boolean b1 = month.isValidYear(2012);
		System.out.println(b1);

		// Using get() Method
		MonthDay md2 = MonthDay.now();
		long l1 = md2.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(l1);

		// Using range() Method
		MonthDay month2 = MonthDay.now();
		ValueRange r1 = month2.range(ChronoField.MONTH_OF_YEAR);
		System.out.println(r1);
		ValueRange r2 = month2.range(ChronoField.DAY_OF_MONTH);
		System.out.println(r2);

		// Other Methods
		MonthDay md = MonthDay.of(4, 4);
		LocalDate date = md.atYear(1998);
		System.out.println(date);

//		boolean b2 = md.isBefore(md1);
//		MonthDay md3 = md.withMonth(8);
//		int i1 = md.getMonthValue();
		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM");
		String s1 = md.format(formate);
		System.out.println(s1);

	}

}
