package com.srktestcase;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	private final Integer counter;
	
	
	public ParameterizedTest(Integer counter) {
		super();
		this.counter = counter;
	}

	@Parameterized.Parameters
	public static List<Integer> counterIncreament(){
		return Arrays.asList(1, 2, 3, 4, 5);
	}

	@Test
	public void testParameter() {
		System.out.println("counter value: "+ counter);
	}

}
