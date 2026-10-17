package com.java7.jvm_enhancements;

import java.util.concurrent.Phaser;

public class PhaserExample {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);

		for (int i = 0; i < 3; i++) {
			final int workId = i;
			phaser.register();

			new Thread(() -> {
				try {
					System.out.println("Worker " + workId + " - Phase 0");
					phaser.arriveAndAwaitAdvance();

					System.out.println("Worker " + workId + " - Phase 1");
					phaser.arriveAndAwaitAdvance();

					System.out.println("Worker " + workId + " - Phase 2");
					phaser.arriveAndAwaitAdvance();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();
		}

		for (int phase = 0; phase < 3; phase++) {
			System.out.println("Main Thread - Phase " + phase);
			phaser.arriveAndAwaitAdvance();
		}
		phaser.arriveAndAwaitAdvance();
		System.out.println("All Phases Completed");
	}
}
