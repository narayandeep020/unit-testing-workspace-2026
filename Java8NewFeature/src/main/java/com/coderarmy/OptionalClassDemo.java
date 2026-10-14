package com.coderarmy;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {

		Optional<String> name = getName();

		System.out.println(name.get());

//		if(name.isPresent()) {
//			System.out.println(name.get());
//		}

//		name.ifPresent(System.out::println);

//		System.out.println(name.orElse("Unknown"));

//		System.out.println(name.orElseGet(() -> "Unknown"));

//		System.out.println(name.orElseThrow(() -> new IllegalArgumentException("Value is missing")));

//		System.out.println(name.orElseThrow(null));
	}

	public static Optional<String> getName() {
		return Optional.ofNullable("Deep");
	}
}
