package com.feature.method_references;

public class InstanceMethodReference2 {

	public void printMsg() {
		System.out.println("Hello, this is instance method");
	}

	public static void main(String[] args) {

//		InstanceMethodReference2 mi = new InstanceMethodReference2();

		Thread t1 = new Thread(new InstanceMethodReference2()::printMsg);
		t1.start();
	}

}
