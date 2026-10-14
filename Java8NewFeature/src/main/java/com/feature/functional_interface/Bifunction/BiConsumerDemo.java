package com.feature.functional_interface.Bifunction;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	static void showDetails(String name, Integer age) {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {

		// Referring method
		BiConsumer<String, Integer> biCon = BiConsumerDemo::showDetails;
		biCon.accept("Tom", 20);
		biCon.accept("Jack", 25);

		// Using lambda expression
		BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);
		biCon2.accept("Peter", 28);
	}

}
