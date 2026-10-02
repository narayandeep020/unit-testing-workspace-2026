package com.feature.functional_interface.Predefined;

import java.util.function.Supplier;

//Supplier : No input , one output
public class PreSupplier {

	public static void main(String[] args) {

		Supplier<String> ver = () -> "Good Morning from Supplier!";

		System.out.println(ver.get());
	}

}
