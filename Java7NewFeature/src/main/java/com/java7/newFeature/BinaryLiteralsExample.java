package com.java7.newFeature;

/**
 * Hello world!
 *
 */
public class BinaryLiteralsExample {
	public static void main(String[] args) {

		byte b1 = 0b010;
		byte b2 = 0B010;
		System.out.println("----------Binary Literal in Byte----------------");
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);

		short s1 = 0b010;
		short s2 = 0B010;
		System.out.println("----------Binary Literal in Short----------------");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		int i1 = 0b010;
		int i2 = 0B010;
		System.out.println("----------Binary Literal in Integer----------------");
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);

		long l1 = 0b0000011111100001;
		long l2 = 0B0000011111100001;
		System.out.println("----------Binary Literal in Long----------------");
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);

		int deci = 10;
		int oct = 010;
		int hexa = 0x10;
		System.out.println("----------Literal Decimal, Octal, Hexadecimal--------");
		System.out.println("Decimal value: " + deci);
		System.out.println("Octal value: " + oct);
		System.out.println("HexaDecimal value: " + hexa);

	}
}
