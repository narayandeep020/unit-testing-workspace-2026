package com.feature.functional_interface.Bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bfobj = (num1, num2) -> num1 + num2;
//		System.out.println(bfobj.apply(6, 6)); //returns and print 12

		Function<Integer, Integer> fun = a -> a * a;
		System.out.println(bfobj.andThen(fun).apply(6, 10));
	}
}
//andThen():- 

//bfobj.apply(6, 10) → 16  //(num1, num2) -> num1 + num2
//fun.apply(16*16) → 256  //a -> a * a;
//Output → 256