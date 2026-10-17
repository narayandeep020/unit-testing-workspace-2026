package com.java7.jvm_enhancements;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int THRESHOLD = 1000;
	private final int[] data;
	private final int start;
	private final int end;

	public SumTask(int[] data, int start, int end) {
		super();
		this.data = data;
		this.start = start;
		this.end = end;
	}

	protected Long compute() {
		int length = end - start;

		if (length <= THRESHOLD) {
			long sum = 0;
			for (int i = start; i < end; i++) {
				sum += data[i];
			}
			return sum;
		}

		int midpoint = start + length / 2;
		SumTask leftTask = new SumTask(data, start, midpoint);
		SumTask rightTask = new SumTask(data, midpoint, end);

		leftTask.fork();
		long rightResult = rightTask.compute();
		long leftResult = leftTask.join();

		return leftResult + rightResult;
	}
}

public class ForkJoinExample {

	public static void main(String[] args) {

		int[] numbers = new int[1000];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		ForkJoinPool pool = new ForkJoinPool();

		SumTask rootTask = new SumTask(numbers, 0, numbers.length);
		long totalSum = pool.invoke(rootTask);

		System.out.println("The Total Sum is: " + totalSum);
	}

}
