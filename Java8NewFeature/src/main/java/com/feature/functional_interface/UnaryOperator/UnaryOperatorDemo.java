package com.feature.functional_interface.UnaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<Integer> squre = n -> n * n;
		System.out.println(squre.apply(5));

		UnaryOperator<Integer> add = n -> n + 5;
		Function<Integer, Integer> result = squre.andThen(add);
		System.out.println(result.apply(5));

//		Function<Integer, Integer> result = squre.compose(add);

		UnaryOperator<String> str = UnaryOperator.identity();

		System.out.println(str.apply("Java World!"));

	}
}

// apply()-->performs the operation defined in the lambda expression and returns the result
//andThen()-->Current function -> Next function
//compose()-->Given function -> Current function
//identity()-->returns the same value passed to it,does not perform any modification.