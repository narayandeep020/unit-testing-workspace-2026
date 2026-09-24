package com.wildcard;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcardDemo2 {

	public static void main(String[] args) {

		List<Dog> dog = new ArrayList<>();
		dog.add(new Dog());
		dog.add(new Dog());
		fun(dog);

		List<Animal> animal = new ArrayList<>();
		animal.add(new Animal());
		fun(animal);

	}

	static void fun(List<?> values) {
		for (Object obj : values) {
			System.out.println(obj.getClass().getName());
		}
	}
}

class Animal {
	void eat() {
		System.out.println("Eating....");
	}

	void walk() {
		System.out.println("Walking....");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking....");
	}
}