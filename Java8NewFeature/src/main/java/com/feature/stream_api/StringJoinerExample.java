package com.feature.stream_api;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {

//		StringJoiner joinNames = new StringJoiner(",");// passing comma(,) as delimiter

		// passing comma(,) and square-brackets prefix & suffix as delimiter
//		StringJoiner joinNames = new StringJoiner(",", "[", "]");
//		joinNames.add("James");
//		joinNames.add("Oliver");
//		joinNames.add("Peter");
//		joinNames.add("Robert");
//
//		StringJoiner joinName2 = new StringJoiner(",", "[", "]");
//		joinName2.add("Deep");
//		joinName2.add("Tech");
//
//		StringJoiner merage = joinNames.merge(joinName2);
//		System.out.println("Merage    " + merage);

		StringJoiner join = new StringJoiner(",");
		// We can set default empty value.
		join.setEmptyValue("It is Empty");
		System.out.println(join);

		// Adding values to StringJoiner
		join.add("Java");
		join.add("Deep");
		System.out.println(join);

		// Returns length of StringJoiner
		int length = join.length();
		System.out.println("Length: " + length);

		String str = join.toString();
		System.out.println(str);

		char ch = str.charAt(3);
		System.out.println("Character at index 3: " + ch);

		join.add("Hello");
		System.out.println(join);

		int newLength = join.length();
		System.out.println("New Length: " + newLength);
	}

}
