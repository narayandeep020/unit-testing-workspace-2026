package com.feature.functional_interface;

@FunctionalInterface
interface Sayable {
	void say(String msg);
}

// Basic Functional Interface Implementation
public class BasicFunctionInterface implements Sayable {

	public static void main(String[] args) {

		BasicFunctionInterface bf = new BasicFunctionInterface();
		bf.say("Hello Java");
	}

	@Override
	public void say(String msg) {

		System.out.println(msg);
	}
}
