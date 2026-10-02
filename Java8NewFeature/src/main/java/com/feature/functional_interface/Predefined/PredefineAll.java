package com.feature.functional_interface.Predefined;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefineAll {

	public static void main(String[] args) {
		// built-in Predicate functional interface

		Predicate<Integer> p1 = (num) -> num % 2 == 0;

		System.out.println(p1.test(10));
		System.out.println(p1.test(7));

		Predicate<String> p2 = (str) -> str.isEmpty();

		System.out.println(p2.test(""));
		System.out.println(p2.test("Deep"));

		// built-in Function functional interface

		Function<String, Integer> f1 = (str) -> str.length();
		System.out.println(f1.apply("Deep"));

		Function<Integer, Integer> f2 = (num) -> num * num;
		System.out.println(f2.apply(10));

		// built-in Consumer functional interface

		Consumer<String> c1 = (name) -> System.out.println("My name is: " + name);
		c1.accept("Deep");

		Consumer<Integer> c2 = (age) -> System.out.println("My Age is: " + age);
		c2.accept(24);

		// built-in Supplier functional interface

		Supplier<Integer> s1 = () -> (int) Math.random();
		System.out.println(s1.get());

		String a = "Deep";
		String b = " Lodhi";
		Supplier<String> s2 = () -> (a.concat(b));
		System.out.println(s2.get());
	}

}
