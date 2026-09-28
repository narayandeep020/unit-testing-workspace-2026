package com.feature.optional_class;

import java.util.Optional;

public class OptionalClass6 {

	public static void main(String[] args) {

		// Using Optional.map() Method
		Optional<String> nameOptional = Optional.of("Deep Tech");
		Optional<String> upperName = nameOptional.map(String::toUpperCase);
		upperName.ifPresent(System.out::println);

		// Using Optional.flatMap() Method
		Optional<Integer> nameLength = nameOptional.flatMap(name -> Optional.of(name.length()));
		nameLength.ifPresent(length -> System.out.println("Name Length: " + length));
	}
}
