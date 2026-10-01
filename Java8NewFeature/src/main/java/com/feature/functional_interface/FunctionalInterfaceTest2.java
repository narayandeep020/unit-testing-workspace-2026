package com.feature.functional_interface;

interface Doable {
	default void doIt() {
		System.out.println("Do it now");
	}
}

@FunctionalInterface
interface Sayable2 extends Doable {
	void say(String mag);
}

//Valid Functional Interface Extending Non-Functional Interface
public class FunctionalInterfaceTest2 implements Sayable2 {

	@Override
	public void say(String msg) {
		System.out.println(msg);

	}

	public static void main(String[] args) {

		FunctionalInterfaceTest2 fi = new FunctionalInterfaceTest2();
		fi.say("Learn Java");
		fi.doIt();
	}
}
