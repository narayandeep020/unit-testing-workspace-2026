package com.feature.functional_interface;

interface MessageDisplay {
	static void showStaticMsg() {
		System.out.println("Static Greeting: Welcome!");
	}

	void executeCustomAction(String input);
}

public class StaticMethodExample2 implements MessageDisplay {

	public static void main(String[] args) {
		StaticMethodExample2 sm = new StaticMethodExample2();
		MessageDisplay.showStaticMsg();
		sm.executeCustomAction("Overridden Message: Action Completed!");
	}

	@Override
	public void executeCustomAction(String input) {
		System.out.println(input);

	}

}
