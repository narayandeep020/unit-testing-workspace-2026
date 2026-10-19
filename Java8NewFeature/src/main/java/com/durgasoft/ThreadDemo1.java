package com.durgasoft;

// thread without lambda expression
public class ThreadDemo1 {

	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		t1.start();

		// main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}

// child thread
class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}

	}
}