package com.feature.optional_class;

import java.util.Optional;

//If Value is not Present
public class OptionalDemo1 {

	public static void main(String[] args) {
		String[] str = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);

		if (checkNull.isPresent()) {
			String lowerCase = str[5].toLowerCase();
			System.out.println(lowerCase);
		} else {
			System.out.println("The string value is not present");
		}
	}
}
