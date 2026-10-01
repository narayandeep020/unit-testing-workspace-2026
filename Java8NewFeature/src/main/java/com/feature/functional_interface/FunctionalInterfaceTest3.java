package com.feature.functional_interface;

@FunctionalInterface
interface Supplier<T> {
	T get();
}

public class FunctionalInterfaceTest3 implements Supplier<Object> {

	public static void main(String[] args) {
		
		Supplier<String> var = () -> "Good Morning from Supplier!";
		System.out.println(var.get());
	}

	@Override
	public Object get() {
		return null ;
	}

}
