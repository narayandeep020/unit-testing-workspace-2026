package com.feature.method_references;

public class MethodReferences2 {

	public static void threadStatus() {
		System.out.println("Thread is running.....");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(MethodReferences2::threadStatus);
		t2.start();
	}
}
