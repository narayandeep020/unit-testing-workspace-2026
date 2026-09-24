package com.generic;

import com.generic.Box;

public class GenericDemo {

	public static void main(String[] args) {

		Box<Integer> b1 = new Box<>(10);
		Box<String> b2 = new Box<>("Java");
		Box<Boolean> b3 = new Box<>(false);

		System.out.println(b1.getValue() + 5);
		System.out.println(b2.getValue() + 5);
		System.out.println(b3.getValue());

//		String s1 = (String)b1.getValue();s
	}

}

//Generic
class Box<T> {// type parameter
	private T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
