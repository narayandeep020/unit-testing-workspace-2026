package com.java7.newFeature;

public class MultipleExceptionExample {

	public static void main(String[] args) {
		try {
			int arr[] = new int[10];
			arr[10] = 30 / 0;

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		} catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println(ar.getMessage());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
