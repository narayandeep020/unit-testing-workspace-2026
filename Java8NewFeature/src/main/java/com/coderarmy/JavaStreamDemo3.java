package com.coderarmy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class JavaStreamDemo3 {

	public static void main(String[] args) {
		// Terminal Operation

		List<Integer> list = Arrays.asList(5, 13, 11, 9);
//		list.stream().map(x -> x + 1).forEach(System.out::println);

//		Set<Integer> set = list.stream().map(x -> x + 1).collect(Collectors.toSet());
//		set.add(4); // We can also add new elements
//		System.out.println(set);

//		int sum = list.stream().reduce(0, (a, b) -> a + b);
//		System.out.println(sum);

//		long num = list.stream().filter(x -> x > 10).count();
//		System.out.println(num);

//		Optional<Integer> num1 = list.stream().filter(x -> x > 10).findFirst();// also findAny() use
//		System.out.println(num1.get());

//		boolean match = list.stream().filter(x -> x > 10)
//			    .anyMatch(x -> x % 2 == 0)
//				.allMatch(x -> x % 2 == 0)
//				.noneMatch(x -> x % 2 == 0);
//		 System.out.println(match);

		OptionalDouble avg = list.stream().filter(x -> x > 10).mapToInt(x -> x).average();
		System.out.println(avg.getAsDouble());
	}

}

// forEach(), forEachOrderd()
// collect() -----> Collectors
// reduce()----> combine stream element into single value
// count
// findFirst()----> short circuting 
// findAny()
// anyMatch(), allMatch(), noneMatch()
// sum(), max(), min(), average()