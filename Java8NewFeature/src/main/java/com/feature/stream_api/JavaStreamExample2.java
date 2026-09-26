package com.feature.stream_api;

import java.util.Random;
import java.util.stream.Stream;

public class JavaStreamExample2 {

	public static void main(String[] args) {
		// iterating() using Stream

//		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
//				.forEach(System.out::println);

		// generate() using Stream
		Random random = new Random();
		Stream.generate(() -> random.nextInt(100)).limit(5).forEach(System.out::println);
		Stream.generate(() -> "Hello").limit(3).forEach(System.out::println);

	}

}
