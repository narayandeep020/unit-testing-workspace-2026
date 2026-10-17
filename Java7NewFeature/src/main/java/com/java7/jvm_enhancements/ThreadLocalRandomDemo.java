package com.java7.jvm_enhancements;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadLocalRandomDemo {

	public static void main(String[] args) {
		// Create a thread pool with 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 0; i <= 5; i++) {
			final int taskId = i;
			executor.submit(() -> {
				String threadName = Thread.currentThread().getName();

				ThreadLocalRandom random = ThreadLocalRandom.current();

				// Generate different types of pseudo-random values
				int randomInt = random.nextInt();
				int boundedInt = random.nextInt(1, 101);
				double randomDouble = random.nextDouble(0.0, 1.0);
				boolean randomBoolean = random.nextBoolean();

				System.out.printf("[%s] Task %d -> Int: %d | Bound Int(1-100): %d | Double: %.4f | Boolean: %b%n",
						threadName, taskId, randomInt, boundedInt, randomDouble, randomBoolean);
			});
		}
		executor.shutdown();
		try {
			if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
				executor.shutdownNow();
			}
		} catch (Exception e) {
			executor.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}
}
