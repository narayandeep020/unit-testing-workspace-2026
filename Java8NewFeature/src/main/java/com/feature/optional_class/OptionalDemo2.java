package com.feature.optional_class;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {

		// If Value is Present
		String[] str = new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String lowerCase = str[5].toLowerCase();
			System.out.println(lowerCase);
		} else {
			System.out.println("The string value is not present.");
		}
		System.out.println("----------------------------");

		// Using Optional.ifPresent() and Optional.get() Methods
		checkNull.ifPresent(System.out::println); // printing value by using method reference
		System.out.println(checkNull.get()); // printing value by using get method
		System.out.println(str[5].toLowerCase());
	}
}
