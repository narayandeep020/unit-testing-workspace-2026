package com.feature.optional_class;

import java.util.Optional;

public class OptionalClass4 {

	// Using Optional.filter() Method
	public static void main(String[] args) {

		Optional<String> userOptional = Optional.of("admin");
		// Use filter to check if the username is "admin"
		Optional<String> filteredUser = userOptional.filter(username -> username.equals("admin"));
		filteredUser.ifPresent(username -> System.out.println("User is an admin"));

		Optional<String> anotherUser = Optional.of("Deep");
		Optional<String> filteredAnotherUser = anotherUser.filter(username -> username.equals("admin"));
		// This will print nothing since the filter condition is not met
		filteredAnotherUser.ifPresent(username -> System.out.println("User is an admin"));
	}
}
