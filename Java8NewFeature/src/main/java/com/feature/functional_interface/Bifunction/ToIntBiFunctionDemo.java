package com.feature.functional_interface.Bifunction;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionDemo {

	public static void main(String[] args) {

		ToIntBiFunction<Integer, String> fun = (num, str) -> num + Integer.parseInt(str) * 4;
		int result = fun.applyAsInt(4, "10");
		System.out.println(result);

		ToIntBiFunction<String, String> fun2 = (str1, str2) -> str1.length() + str2.length();
		int result2 = fun2.applyAsInt("Java", "Programming");
		System.out.println(result2);

	}

}
// applyAsInt()--> The applyAsInt() method applies the defined operation to two input arguments and returns the resulting int value.
