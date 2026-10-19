package com.feature.functional_interface.PrimitiveFunctions;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionDemo {

	public static void main(String[] args) {

		LongToDoubleFunction metersToKilometers = meters -> meters / 1000.0;

		System.out.println(metersToKilometers.applyAsDouble(5000L));

		LongToDoubleFunction operation = value -> (value + 10) / 2.0;

		System.out.println(operation.applyAsDouble(20L));
	}

}
