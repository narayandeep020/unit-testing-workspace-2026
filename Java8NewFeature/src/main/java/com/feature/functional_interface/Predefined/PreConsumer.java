package com.feature.functional_interface.Predefined;

import java.util.function.Consumer;

//Takes input T, returns nothing
public class PreConsumer {

	public static void main(String[] args) {
		Consumer<String> con = c -> System.out.println(c);
		con.accept("Good Morning, Consumer!");

		// Defining a Consumer with a Method Reference
		Consumer<String> mthdRef = System.out::println;
		mthdRef.accept("Good Morning Consumer Method Reference!");
	}

}
