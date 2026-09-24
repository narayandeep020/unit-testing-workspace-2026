package com.feature.lambda_expression;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		numbers.forEach(number -> System.out.println(number + " "));
	}

}
