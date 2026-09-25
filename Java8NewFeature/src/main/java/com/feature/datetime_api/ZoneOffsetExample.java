package com.feature.datetime_api;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class ZoneOffsetExample {

	public static void main(String[] args) {

		// Using adjustInto() Method
		ZoneOffset off = ZoneOffset.UTC;
		Temporal temp = off.adjustInto(ZonedDateTime.now());
		System.out.println(temp);
		System.out.println("--------------------");

		// Using the hours () Method
		ZoneOffset off1 = ZoneOffset.ofHours(5);
		System.out.println(off1);

		// Using ofHoursMinutes() Method
		ZoneOffset off2 = ZoneOffset.ofHoursMinutes(5, 30);
		System.out.println(off2);
		System.out.println("--------------------");

		// Using isSupported() Method
		boolean b1 = off.isSupported(ChronoField.OFFSET_SECONDS);
		boolean b2 = off.isSupported(ChronoField.SECOND_OF_MINUTE);
		System.out.println(b1);
		System.out.println(b2);

		// Using ZoneOffset of() method
		ZoneOffset set1 = ZoneOffset.of("Z");
		System.out.println(set1);
	}

}
