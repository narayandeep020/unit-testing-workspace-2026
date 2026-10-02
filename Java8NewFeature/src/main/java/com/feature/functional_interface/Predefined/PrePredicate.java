package com.feature.functional_interface.Predefined;

import java.util.ArrayList;
import java.util.function.Predicate;

//Takes input T, returns boolean.
public class PrePredicate {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("India");
		al.add("America");
		al.add("Australia");
		al.add("Russia");
		al.add("Finland");

		Predicate<String> pre = s -> s.length() > 6;
		for (String str : al) {
			System.out.println("Does the string '" + str + "' have more than six characters? " + pre.test(str));
		}
	}

}
