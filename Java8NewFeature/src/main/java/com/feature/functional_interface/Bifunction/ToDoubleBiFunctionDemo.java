package com.feature.functional_interface.Bifunction;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionDemo {

	public static void main(String[] args) {

		ToDoubleBiFunction<Integer, String> fun1 = (num, str) -> num + Integer.parseInt(str) * 3.2;
		double result = fun1.applyAsDouble(3, "10");
		System.out.println(result);

		ToDoubleBiFunction<Integer, Double> fun2 = (quantity, price) -> quantity * price;
		double calculate = fun2.applyAsDouble(5, 29.5);
		System.out.println(calculate);
	}

}
// applyAsDouble-->The applyAsDouble() method applies the defined operation to two input arguments and returns the resulting double value.