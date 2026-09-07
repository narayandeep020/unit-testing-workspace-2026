package com.java7.newFeature;

public class UnderscoreInNumericLiteral {

	public static void main(String[] args) {

		//integer
		int a = 10_000;
		System.out.println("a = " + a);

		//float
		float b = 10.5_000f;
		System.out.println("d = " + b);

		//binary
		int c = 0B10_10;
		System.out.println("c = " + c);

		//hexadecimal
		int d = 0x1_1;
		System.out.println("d = " + d);

		//octal
		int e = 01_1;
		System.out.println("e = " + e);
	}
}
