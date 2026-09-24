package com.feature.lambda_expression;

interface Sayabled {
	public String say(String name);
}

public class LambdaWithSingleParameter {

	public static void main(String[] args) {

		Sayabled s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Suman"));

		Sayabled s2 = name -> {
			return "Hii, " + name;
		};
		System.out.println(s2.say("Chakra"));
	}

}
