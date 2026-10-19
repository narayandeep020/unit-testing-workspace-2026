package com.feature.functional_interface.PrimitiveFunctions;

import java.util.function.IntFunction;

public class IntFunctionDemo {

	public static void main(String[] args) {

		IntFunction<String> text = value -> "Value: " + value;

		IntFunction<Integer> square = value -> value * value;

		IntFunction<Double> half = value -> value / 2.0;

		System.out.println(text.apply(10));
		System.out.println(square.apply(5));
		System.out.println(half.apply(8));
	}
}
