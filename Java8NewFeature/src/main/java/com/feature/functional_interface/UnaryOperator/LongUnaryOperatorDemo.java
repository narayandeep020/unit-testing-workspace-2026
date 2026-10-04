package com.feature.functional_interface.UnaryOperator;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorDemo {

	public static void main(String[] args) {

		LongUnaryOperator operation = n -> n * n;
		System.out.println(operation.applyAsLong(6));

		LongUnaryOperator operation1 = LongUnaryOperator.identity();
		System.out.println(operation1.applyAsLong(25));

		LongUnaryOperator operation2 = n -> n + 5;
		LongUnaryOperator result = operation2.andThen(n -> n * 2);
		System.out.println(result.applyAsLong(10));

		LongUnaryOperator operation5 = n -> n - 4;
		LongUnaryOperator result2 = operation5.compose(n -> n * 3);
		System.out.println(result2.applyAsLong(10));
	}
}
