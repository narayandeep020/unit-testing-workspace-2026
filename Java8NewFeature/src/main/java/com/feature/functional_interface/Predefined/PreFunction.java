package com.feature.functional_interface.Predefined;

import java.util.function.Function;
import java.util.ArrayList;

//It takes an argument and returns an object
public class PreFunction {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("India");
		al.add("America");
		al.add("Australia");
		al.add("Russia");
		al.add("Finland");

		Function<String, Integer> strLen = s -> s.length();
		for (String str : al) {
			System.out.println("The string '" + str + "' has " + strLen.apply(str) + " characters.");
		}
	}

}