package com.feature.functional_interface;

//Multiple Inheritance Conflict of Default Method

interface A {
	default void show() {
		System.out.println("A's default method");
	}
}

interface B {
	default void show() {
		System.out.println("B's default method");
	}
}

public class DefaultMethodExample2 implements A, B {

	public static void main(String[] args) {

		DefaultMethodExample2 dm = new DefaultMethodExample2();
		dm.show();
	}

	@Override
	public void show() {
		A.super.show();
//		B.super.show();
	}
}
