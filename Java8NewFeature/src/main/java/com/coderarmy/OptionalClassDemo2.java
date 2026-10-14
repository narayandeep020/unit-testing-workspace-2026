package com.coderarmy;

import java.util.Optional;

public class OptionalClassDemo2 {

	public static void main(String[] args) {

		Optional<User> user = getUser();

//		if (user != null) {
//			Address address = user.address;
//			if (address != null) {
//				String city = address.city;
//				if (city != null) {
//					System.out.println(city);
//				}
//			}
//		}

		
		user.flatMap(x -> x.address).map(y -> y.city).ifPresent(System.out::println);

		Optional<String> name = Optional.of("DeepTech");

//		Optional<String> result = name.filter(x -> x.length() > 2);
//		System.out.println(result.orElse("Empty"));

		name.map(x -> x.length()).filter(len -> len > 4).ifPresent(System.out::println);

	}

	private static Optional<User> getUser() {
		Address a = new Address();
		a.city = "Delhi";

		User u = new User();
		u.address = Optional.of(a);

		return Optional.of(u);
	}

}

class User {
	public Optional<Address> address;
}

class Address {
	public String city;
}

//map()-> If value present then apply the map,and return optional. orElse return empty.
//flatMap()-> If value present in <Optional><Optional<Address>> , flatMap flat the value like Optional<Address> 
//filter()-> Check a condition, if true keep the value or else nothing
