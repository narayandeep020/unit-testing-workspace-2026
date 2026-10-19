package com.feature.functional_interface.PrimitiveFunctions;

import java.util.function.ToLongFunction;

public class ToLongFunctionDemo {

	public static void main(String[] args) {

		ToLongFunction<String> operation = value -> value.length();

		ToLongFunction<Integer> operation1 = value -> value * 10000L;

		System.out.println(operation.applyAsLong("GeeksForGeeks"));

		System.out.println(operation1.applyAsLong(3));
	}

}
