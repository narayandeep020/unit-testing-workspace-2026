package com.feature.functional_interface.UnaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {

		Integer[] numArr = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		Integer sum = mathSum(Arrays.asList(numArr), 0, (x, y) -> x + y);
		System.out.println("For the numbers: ");

		for (Integer k : numArr) {
			System.out.println(k + " ");
		}
		System.out.println();
		System.out.println("The total is: " + sum);
	}

	private static <T> T mathSum(List<T> asList, T init, BinaryOperator<T> bo) {
		T res = init;
		for (T k : asList) {
			res = bo.apply(res, k);
		}
		return res;
	}

}
