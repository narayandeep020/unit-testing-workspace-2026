package com.feature.method_references;

import java.util.function.BiFunction;

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;

	}
}

public class MethodReference3 {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bi = Arithmetic::add;
		int result = bi.apply(10, 30);
		System.out.println(result);
	}

}
