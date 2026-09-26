package com.feature.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Products {
	int id;
	String name;
	float price;

	public Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class CollectorsClassExample {
	public static void main(String[] args) {

		List<Products> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Products(1, "HP Laptop", 25000f));
		productsList.add(new Products(2, "Dell Laptop", 30000f));
		productsList.add(new Products(3, "Lenevo Laptop", 28000f));
		productsList.add(new Products(4, "Sony Laptop", 28000f));
		productsList.add(new Products(5, "Apple Laptop", 90000f));

		// **Converting product prices into a List using Collectors**
		List<Float> list1 = productsList.stream().map(x -> x.price).collect(Collectors.toList());
		System.out.println("Using toList: " + list1);

		// **Converting product prices into a Set using Collectors**
		Set<Float> list2 = productsList.stream().map(x -> x.price).collect(Collectors.toSet());
		System.out.println("Using toSet: " + list2);

		// **Summing all prices using summingDouble**
		Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x -> x.price));
		// **Summing all IDs using summingInt**
		Integer sumId = productsList.stream().collect(Collectors.summingInt(x -> x.id));
		System.out.println("Sum of prices: " + sumPrices + "\nSum of id's: " + sumId);

		// **Calculating average price using averagingDouble**
		Double average = productsList.stream().collect(Collectors.averagingDouble(p -> p.price));
		// **Counting total elements using Collectors.counting()**
		long noOfElements = productsList.stream().collect(Collectors.counting());
		System.out.println("Average price is: " + average + "\nTotal Elements: " + noOfElements);

	}

}

// toList()
// toSet()
// summingDouble(), summingInt()
// averagingDouble()
// counting()
