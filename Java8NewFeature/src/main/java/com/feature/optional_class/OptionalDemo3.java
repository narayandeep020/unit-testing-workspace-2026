package com.feature.optional_class;

import java.util.Optional;

//Using Various Methods of Optional Class
public class OptionalDemo3 {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		// It returns an empty instance of the Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		// It returns a non-empty Optional
		Optional<String> value = Optional.of(str[5]);
		System.out.println("Filtered value: " + value.filter(s -> s.equals("ABC")));
		System.out.println("Filtered value: " + value.filter(s -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));

		System.out.println("Getting value: " + value.get());
		System.out.println("Getting hashCode: " + value.hashCode());
		System.out.println("Is value present: " + value.isPresent());
		System.out.println("Nullable Optional: " + Optional.ofNullable(str[5]));

		System.out.println("orElse : " + value.orElse("Value is not present"));
		System.out.println("orElse : " + empty.orElse("Value is not present"));

		value.ifPresent(System.out::println);// printing value by using method reference
	}
}
