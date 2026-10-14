package com.coderarmy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamDemo2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 34, 1, 4, 13);

		// Intermediate Function
		list.stream()
		.filter(x -> x > 10)
		.map(x -> x * 2) //stateless
		.peek(System.out::println)
		.sorted() //statefull
//		.distinct()
//		.skip(1)
		.forEach(System.out::println);
		System.out.println("----------------------------");

		// flatMap()
		List<List<Integer>> list2 = Arrays.asList(
		Arrays.asList(1, 2), 
		Arrays.asList(3, 4));

		list2.stream()
		.flatMap(x -> x.stream())
		.map(x -> x * 2)
		.forEach(System.out::println);
		System.out.println("----------------------------");

		// Infinite Stream
		Stream.iterate(1, x -> x + 1)
		.limit(10)
		.skip(5)
		.forEach(System.out::println);
	}

}

// filter()
// map()
// sorted()
// flatMap()
// forEach()
// iterator()
// limit()
// distinct()
// skip()
// peek()
