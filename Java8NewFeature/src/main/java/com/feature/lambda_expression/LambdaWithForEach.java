package com.feature.lambda_expression;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithForEach {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("deep");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");

		list.forEach((n) -> System.out.println(n));
	}
}
