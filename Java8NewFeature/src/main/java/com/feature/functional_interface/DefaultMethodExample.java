package com.feature.functional_interface;

interface DefaultDemo {
	default void m1() {
		System.out.println("Default Method in Interface");
	}
}

public class DefaultMethodExample implements DefaultDemo {

	public static void main(String[] args) {
		DefaultMethodExample dm = new DefaultMethodExample();
		dm.m1();
	}
}
