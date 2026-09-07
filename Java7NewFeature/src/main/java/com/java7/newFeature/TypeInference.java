package com.java7.newFeature;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

	public static void main(String[] args) {
		// in java6 and earlier
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(24);
		for (Integer element : list) {
			System.out.println(element);
		}

		System.out.println("~~~~~~~~~~~~~~~~");

		// in java7 diamond is used 
		List<Integer> list2 = new ArrayList<>();
		list2.add(15);
		list2.add(30);
		for (Integer element : list2) {
			System.out.println(element);
		}
	}
}
