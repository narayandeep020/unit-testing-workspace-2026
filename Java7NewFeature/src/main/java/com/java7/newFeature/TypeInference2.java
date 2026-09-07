package com.java7.newFeature;

public class TypeInference2 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		GenericClass<String> gc2 = new GenericClass<>("Hello Java");
	}
}

class GenericClass<X> {
	<T> GenericClass(T t) {
		System.out.println(t);
	}
}