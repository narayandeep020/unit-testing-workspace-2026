package com.feature.stream_api;

import java.util.ArrayList;
import java.util.List;

// Filtering Collection Using Stream
public class JavaStreamExample {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<>();

		productsList.add(new Product(1, "Hp Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

//		List<Float> priceBase = productsList.stream().filter(p -> p.price < 30000f).map(p -> p.price)
//				.collect(Collectors.toList());
//		System.out.println(priceBase);

//		List<String> nameBase = productsList.stream().filter(n -> n.name.contains("D")).map(n -> n.name)
//				.collect(Collectors.toList());
//		System.out.println(nameBase);

//		float totalPrice = productsList.stream().map(p -> p.price).reduce(0.0f, (a, b) -> a + b);// accumulation price
//		float totalPrice1 = productsList.stream().map(p -> p.price).reduce(0.0f, Float::sum);// method reference
//		System.out.println(totalPrice + "\n" + totalPrice1);

		Product productA = productsList.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(productA.price);

		Product productB = productsList.stream().min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(productB.price);
	}
}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}