package com.feature.functional_interface.UnaryOperator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo {

	public static void main(String[] args) {
		IntUnaryOperator ip = n -> n + 15;
//		System.out.println(ip.applyAsInt(6));

		IntUnaryOperator ip2 = IntUnaryOperator.identity();
		System.out.println(ip2.applyAsInt(20));

//		IntUnaryOperator ip3 = ip.andThen(n -> n * 2);
		IntUnaryOperator ip4 = ip.compose(n -> n * 2);
		System.out.println(ip4.applyAsInt(3));
	}
}
//applyAsInt()
//identity()
//andThen()
//compose()