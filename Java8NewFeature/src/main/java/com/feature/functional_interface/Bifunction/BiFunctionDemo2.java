package com.feature.functional_interface.Bifunction;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionDemo2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Olivia");
		map.put(2, "Noah");
		map.put(3, "John");
		map.put(4, "Alex");
		map.put(5, "Emma");
		map.put(6, "Amelia");
		map.put(7, "Noah");

		BiFunction<Integer, String, String> biFun = (key, value) -> "[Key=" + key + ",  " + value + "("
				+ Collections.frequency(map.values(), value) + ")]";
		map.forEach((k, v) -> System.out.println(biFun.apply(k, v)));
	}
}
