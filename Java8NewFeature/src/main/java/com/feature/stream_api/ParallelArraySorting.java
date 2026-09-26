package com.feature.stream_api;

import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 1, 0, 6, 9, 15, -3 };
		for (int i : arr) {
			System.out.print(i + " ");
		}

//		Arrays.parallelSort(arr);
		Arrays.parallelSort(arr, 0, 4);

		System.out.println("\nArray elements after sorting: ");
		for (int j : arr) {
			System.out.print(j + " ");
		}
	}

}
// parallelSort(object)
// parallelSort(object, start index, end index)