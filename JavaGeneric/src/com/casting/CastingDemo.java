package com.casting;

public class CastingDemo {

	public static void main(String[] args) {
		// Up casting
		String s = "Hello Java";
		Object obj = s;
		System.out.println(obj);

		// Down casting
		Object obj2 = "Deep";
		String s2 = (String) obj2;
		System.out.println(s2);

		Object obj3 = 10;
		String s3 = (String) obj3;
		System.out.println(s3);
	}
}
