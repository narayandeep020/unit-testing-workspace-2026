package com.feature.datetime_api;

import java.time.Clock;
import java.time.Duration;

public class ClockExample {

	public static void main(String[] args) {

		// Using getZone() Method
		Clock c1 = Clock.systemDefaultZone();
		System.out.println(c1.getZone());

		// Using instant() and systemUTC() Method
		Clock c2 = Clock.systemUTC();
		System.out.println(c2.instant());

		// Using offset() Method
		Duration d1 = Duration.ofHours(5);
		Clock c3 = Clock.offset(c2, d1);
		System.out.println(c3.instant());
	}
}
