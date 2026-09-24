package com.feature.method_references;

interface Sayable {
	void say();
}

public class MethodReferences1 {

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {

		Sayable s1 = MethodReferences1::saySomething;
		s1.say();
	}

}
