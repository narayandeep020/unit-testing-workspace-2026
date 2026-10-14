package com.feature.functional_interface.Bifunction;

import java.util.function.ToLongBiFunction;

@FunctionalInterface
interface ToLongTriFunction<T, U, V> {

	long applyAsLong(T t, U u, V v);
}

public class ToLongBiFunctionDemo {

	public static void main(String[] args) {

		ToLongBiFunction<Integer, String> obj = (group, unit) -> group + Integer.parseInt(unit) * 100000L;
		System.out.println("The value is given by: " + obj.applyAsLong(5, "10"));

		// Custom functional interface called ToLongTriFunction
		ToLongTriFunction<String, String, String> funLength = (s1, s2, s3) -> s1.length() + s2.length() + s3.length();
		long concat = funLength.applyAsLong("Hello", "Java", "World");
		System.out.println(concat);

	}

}
// applyAsLong()--> The applyAsLong() method applies the defined operation to two input arguments and returns a long result