package com.feature.functional_interface.Predefined;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, String> mul = (x, y) -> "" + (x * y);
		int no1 = 15;
		int no2 = 40;

		String res = mul.apply(no1, no2);
		System.out.println("Multiplying numbers '" + no1 + "' and '" + no2 + "', result is: " + res);

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> +(a + b);

		int output = sum.apply(no1, no2);
		System.out.println("Adding numbers '" + no1 + "' and '" + no2 + "', result is: " + output);
	}
}
