package com.feature.datetime_api;

import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class OffsetTimeExample {

	public static void main(String[] args) {
		// Using get() Method
		OffsetTime set1 = OffsetTime.now();
		int h = set1.get(ChronoField.HOUR_OF_DAY);
		System.out.println(h);
		int m = set1.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(m);
		int s = set1.get(ChronoField.SECOND_OF_DAY);
		System.out.println(s);
		System.out.println("----------------------");

		// Using getHour() Method
		OffsetTime offset = OffsetTime.now();
		int h1 = offset.getHour();
		int m1 = offset.getMinute();
		int s1 = offset.getSecond();
		System.out.println(h1 + ":hour " + m1 + ":Minute " + s1 + ":Second");
		System.out.println("----------------------");

//		LocalTime localTime = LocalTime.of(5, 20);
//		ZoneOffset offset1 = ZoneOffset.of("+05:30");
//		OffsetTime offsetTime = OffsetTime.of(localTime, offset1);
//		System.out.println(offsetTime);
//		System.out.println("----------------------");

		OffsetTime offsetTime1 = OffsetTime.of(LocalTime.of(14, 45), ZoneOffset.of("+05:30"));
		LocalTime localTime1 = offsetTime1.toLocalTime();
		System.out.println(offsetTime1);
		System.out.println(localTime1);

	}

}
