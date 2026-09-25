package com.feature.datetime_api;

import java.time.Period;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		// Using getZone() Method
		ZonedDateTime zone1 = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");
		System.out.println(zone1);

		// Using minus() Method
		ZonedDateTime zone = ZonedDateTime.now();
		ZonedDateTime m = zone.minus(Period.ofDays(126));
		System.out.println(m);

		// Using plus() Method
		ZonedDateTime p = zone.plus(Period.ofDays(126));
		System.out.println(p);
	}

}
