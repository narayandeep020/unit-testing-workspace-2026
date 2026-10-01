package com.feature.functional_interface;

@FunctionalInterface
interface Sayable1 {
	void say(String msg);

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

//Functional Interface with Object Class Methods
public class FunctionalInterfaceTest1 implements Sayable1 {

	public static void main(String[] args) {
		FunctionalInterfaceTest1 fi = new FunctionalInterfaceTest1();
		fi.say("Hey Java");
	}

	@Override
	public void say(String msg) {
		System.out.println(msg);

	}

}
