package com.generic;

public class PairDemo {

	public static void main(String[] args) {

		Pair<Integer, String> p1 = new Pair<>(10, "Deep");
		Pair<Boolean, String> p2 = new Pair<>(true, "Deep");

		System.out.println(p1.first + "," + p1.second);
		System.out.println(p2.first + "," + p2.second);
	}

}

class Pair<T, U> {
	T first;
	U second;

	Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}

}