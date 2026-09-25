package com.feature.datetime_api;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneIdExample {

	public static void main(String[] args) {

		// Creating ZoneId Objects
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");
		ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");
		ZoneId zoneid3 = ZoneId.of("America/New_York");
		LocalTime id1 = LocalTime.now(zoneid1);
		LocalTime id2 = LocalTime.now(zoneid2);
		LocalTime id3 = LocalTime.now(zoneid3);
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id3);
		System.out.println(id1.isBefore(id2));

		// Using systemDefault() Method
		ZoneId zoneid4 = ZoneId.systemDefault();
		System.out.println(zoneid4);

		// Using getId() method
		String s1 = zoneid4.getId();
		System.out.println(s1);

		// Using getDisplayName() Method
		System.out.println(zoneid4.getDisplayName(TextStyle.FULL, Locale.ROOT));
	}
}
