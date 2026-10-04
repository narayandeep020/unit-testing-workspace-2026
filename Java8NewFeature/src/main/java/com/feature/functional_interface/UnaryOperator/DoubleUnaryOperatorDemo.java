package com.feature.functional_interface.UnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorDemo {

	public static void main(String[] args) {
		DoubleUnaryOperator operation = n -> n * 2.5;

		double result = operation.applyAsDouble(8.0);
		System.out.println(result); // 20.0

		DoubleUnaryOperator op1 = DoubleUnaryOperator.identity();
		System.out.println(op1.applyAsDouble(18.05));

//		DoubleUnaryOperator op2 = operation.andThen(n -> n + 4);
		DoubleUnaryOperator op2 = operation.compose(n -> n + 4);
		System.out.println(op2.applyAsDouble(6.0));
	}

}
//applyAsDouble()--> Give Double input value,which is run lambda expression
//identity()--> Produces the same double value supplied as input
//andThen()-->Current function -> Next function
//compose()-->Given function -> Current function