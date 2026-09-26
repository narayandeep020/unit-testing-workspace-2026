package com.feature.stream_api;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
	public static void main(String[] args) {

		// Sequential Stream
//		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		list1.stream().forEach(System.out::println);

		// Parallel Stream
		List<String> list1 = Arrays.asList("Hello", "D", "e", "e", "p");
		list1.parallelStream().forEachOrdered(System.out::println);
	}
}

// stream() // Single thread execute One element at a time
// parallelStream() // Multiple threads execute Multiple elements simultaneously
// forEach()
// forEachOrdered()