package com.wildcard;

import java.util.ArrayList;

public class UpperBoundWildcard {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		System.out.println("Sum Of Integer: " + add(l1));

		ArrayList<Double> l2 = new ArrayList<>();
		l2.add(30.0);
		l2.add(40.0);
		System.out.println("Sum Of Double: " + add(l2));

	}

	private static Double add(ArrayList<? extends Number> num) {
		double sum = 0.0;
		for (Number n : num) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}
}
