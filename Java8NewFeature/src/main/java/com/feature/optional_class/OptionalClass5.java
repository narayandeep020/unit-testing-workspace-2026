package com.feature.optional_class;

import java.util.Optional;

// Using Optional.orElse() and Optional.orElseGet() Method
public class OptionalClass5 {

	public static void main(String[] args) {

		String nameFromDB = getUserNameFromDB();
		Optional<String> optionalName = Optional.ofNullable(nameFromDB);

		// Using orElse() to provide a default name
		String nameWithOrElse = optionalName.orElse("Default User");
		System.out.println("Name With orElse: " + nameWithOrElse);

		// Using orElseGet() to provide a default name using a Supplier
		String nameWithOrElseGet = optionalName.orElseGet(OptionalClass5::getDefaultUserName);
		System.out.println("Name with orElseGet: " + nameWithOrElseGet);

	}

	// A mock method to simulate database access that might return null
	private static String getUserNameFromDB() {
		return null;
	}

	// A method that provides a default username
	private static String getDefaultUserName() {

		System.out.println("Computing default username...");
		return "Computed Default User";
	}
}
