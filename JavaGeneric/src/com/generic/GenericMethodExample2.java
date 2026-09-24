package com.generic;

public class GenericMethodExample2 {

	public static <E> void genericDisplay(E element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}

	public static void main(String[] args) {
		genericDisplay(12);
		genericDisplay("GeekForGeek");
		genericDisplay(1.0f);
	}

}
