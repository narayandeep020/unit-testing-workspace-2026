package com.durgasoft;

//thread with lambda expression
public class ThreadDemo2 {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Lambda:Child Thread");
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Lambda:Main Thread");
		}
	}
}
