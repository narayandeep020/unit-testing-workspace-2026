package com.coderarmy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class JavaStreamDemo {

	public static void main(String[] args) {

		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Integer> list = new ArrayList() {
			{
				add(5);
				add(12);
				add(7);
				add(14);
			}
		};
//
//		Stream<Integer> s = list.stream();
//		s = s.filter(x -> x > 10);
//		s = s.map(x -> x * 2);
//		s.forEach(System.out::println);
//
		list.stream().filter(x -> x > 10).map(x -> x * 2).forEach(System.out::println);

		// Collectors

//		List<Integer> list2 = Arrays.asList(1, 11, 13, 9);
//		List<Integer> lists = list2.stream().map(x -> x + 1).collect(Collectors.toList());
//		System.out.println(lists);

//		Map<Boolean, List<Integer>> mp = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

		List<String> str = Arrays.asList("AA", "BBB", "CCCC", "DD", "EEE");

//		Map<Integer, String> s = str.stream().collect(Collectors.toMap(x -> x.length(), x -> x));

//		Map<Integer, List<String>> mp = str.stream().collect(
//				Collectors.groupingBy(x -> x.length(), Collectors.mapping(x -> x.toLowerCase(), Collectors.toList())));

		String join = str.stream().collect(Collectors.joining("-"));
		System.out.println(join);

	}
}

// toList(), toSet(), toMap()
// groupingBy() ---> mapping()
// partitioningBy()