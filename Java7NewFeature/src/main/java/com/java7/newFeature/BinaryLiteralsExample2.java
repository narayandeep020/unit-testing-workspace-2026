package com.java7.newFeature;

public class BinaryLiteralsExample2 {

	public static void main(String[] args) {
		byte b1 = 5; // A decimal value
		byte b2 = 0b101;// Using b0, The b can be lower or upper case
		byte b3 = -0b101;
		byte b4 = 0b101_0;// Using underscore in binary literal

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);

		System.out.println("is b1 and b2 equal: " + (b1 == b2));
		// Perform operation on binary value
		System.out.println("b2 + 1 = " + (b2 + 1));
		// Perform operation on negative binary value
		System.out.println("b3 + 1 = " + (b3 + 1));
		System.out.println("b4 x 2 = " + (b4 * 2));
	}
}
