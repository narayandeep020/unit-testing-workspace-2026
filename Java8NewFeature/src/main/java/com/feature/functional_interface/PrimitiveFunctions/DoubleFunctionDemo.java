package com.feature.functional_interface.PrimitiveFunctions;

import java.util.function.DoubleFunction;

public class DoubleFunctionDemo {

	public static void main(String[] args) {

		DoubleFunction<String> temp = value -> value + "C";

		System.out.println(temp.apply(37.5));

		DoubleFunction<Integer> operation = value -> (int) value * 10;

		System.out.println(operation.apply(3.2));
	}

}
