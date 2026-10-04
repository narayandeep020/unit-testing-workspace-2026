package com.feature.functional_interface.UnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperator1 {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		List<Integer> res = mathFun(numberList, Y -> Y * 3);
		System.out.println("The Result is: ");
		for (int num : res) {
			System.out.println(num + " ");
		}
	}

	private static <T> List<T> mathFun(List<T> numberList, UnaryOperator<T> unryOp) {
		List<T> res = new ArrayList<>();
		for (T li : numberList) {
			res.add(unryOp.apply(li));
		}
		return res;
	}
}
