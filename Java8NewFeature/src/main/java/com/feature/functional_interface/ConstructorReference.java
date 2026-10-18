package com.feature.functional_interface;

@FunctionalInterface
interface InterDemo {
	public Sample get();
}

class Sample {
	Sample() {
		System.out.println("Sample Constractor.");
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		InterDemo i = Sample::new;
		i.get();
	}
}
