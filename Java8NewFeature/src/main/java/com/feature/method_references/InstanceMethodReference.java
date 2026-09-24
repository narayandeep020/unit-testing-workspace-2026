package com.feature.method_references;

interface Sayable2 {
	void say();
}

public class InstanceMethodReference {

	public void saySomething() {
		System.out.println("Hello, this is non-static method");
	}

	public static void main(String[] args) {
		// creating object
		InstanceMethodReference methodReference = new InstanceMethodReference();

		// Referring non-static method using reference
		Sayable2 say1 = methodReference::saySomething;
		say1.say();

		// Referring non-static method using anonymous object
		Sayable2 say2 = new InstanceMethodReference()::saySomething;
		say2.say();
	}
}
