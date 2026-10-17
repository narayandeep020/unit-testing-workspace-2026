package com.java7.jvm_enhancements;

import java.util.concurrent.ConcurrentLinkedDeque;

// Code Example: Producer-Consumer Paradigm

public class ConcurrentDequeExample {
	public static void main(String[] args) {
		// Initialize an unbounded concurrent double-ended queue
		ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();

		// Thread 1: Producer pushing tasks to the FRONT (Head)
		Runnable producer = () -> {
			for (int i = 1; i <= 5; i++) {
				String task = "Task-" + i;
				deque.addFirst(task);
				System.out.println(Thread.currentThread().getName() + " added to FRONT: " + task);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		};

		// Thread 2: Consumer polling tasks from the BACK (Tail)
		Runnable consumer = () -> {
			int consumedCount = 0;
			while (consumedCount < 5) {
				// pollLast() returns null if the deque is empty instead of blocking
				String task = deque.pollLast();
				if (task != null) {
					System.out.println(Thread.currentThread().getName() + " removed from BACK: " + task);
					consumedCount++;
				} else {
					// Back off slightly if empty to wait for producer
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}
		};

		// Fire up the threads
		Thread producerThread = new Thread(producer, "ProducerThread");
		Thread consumerThread = new Thread(consumer, "ConsumerThread");

		producerThread.start();
		consumerThread.start();
	}
}