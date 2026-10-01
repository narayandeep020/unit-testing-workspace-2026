package com.feature.functional_interface;

interface StaticDemo {
	public static void m1() {
		System.out.println("Static Method in Interface");
	}
}

public class StaticMethodExample {

	public static void main(String[] args) {
		StaticDemo.m1();
	}
}
