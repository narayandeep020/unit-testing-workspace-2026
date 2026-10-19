package com.feature.functional_interface.PrimitiveFunctions;

import java.util.function.LongToIntFunction;
import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {

	public static void main(String[] args) {

		LongToIntFunction longFunction = value -> (int) value * 100;

		ToIntFunction<Double> intFunction = value -> (int) (value * 10);

		System.out.println(longFunction.applyAsInt(20L));
		System.out.println(intFunction.applyAsInt(3.2));
	}
}
