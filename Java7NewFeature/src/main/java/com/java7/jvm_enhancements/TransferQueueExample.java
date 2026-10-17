package com.java7.jvm_enhancements;

import java.util.concurrent.LinkedTransferQueue;

public class TransferQueueExample {
	public static void main(String[] args) throws InterruptedException {

		LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();

		new Thread(() -> {
			try {
				Thread.sleep(2000);
				System.out.println("Consumer received: " + queue.take());
			} catch (Exception e) {
				Thread.currentThread().interrupt();
			}
		}).start();

		System.out.println("Producer transferring item...");
		queue.transfer("Hello from producer!");
		System.out.println("Producer confirmed consumer received item.");
	}
}
