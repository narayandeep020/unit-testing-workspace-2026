package com.feature.method_references;

import java.util.function.BiFunction;

public class InstanceMethodReference3 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> addr = new Arithmetic3()::add;
		int result = addr.apply(12, 24);
		System.out.println(result);
	}
}

class Arithmetic3 {
	public int add(int a, int b) {
		return a + b;
	}
}