package com.feature.functional_interface.PrimitiveFunctions;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionDemo {

	public static void main(String[] args) {

		ToDoubleFunction<Integer> i = value -> Math.sqrt(value);

		System.out.println(i.applyAsDouble(25));

		ToDoubleFunction<String> s = value -> value.length();

		System.out.println(s.applyAsDouble("Narayan"));

	}
}
