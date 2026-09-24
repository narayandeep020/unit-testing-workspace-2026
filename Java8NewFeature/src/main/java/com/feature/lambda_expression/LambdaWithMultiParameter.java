package com.feature.lambda_expression;

@FunctionalInterface
interface MultiParametersFunctionalInterface {
	double calculateAverage(double a, double b, double c);
}

public class LambdaWithMultiParameter {

	public static void main(String[] args) {

		MultiParametersFunctionalInterface myLambda = (a, b, c) -> {
			return (a + b + c) / 3.0;
		};

		double average = myLambda.calculateAverage(10.0, 20.0, 30.0);
		System.out.println("Average: " + average);
	}

}
