package com.srktestcase;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class AssertEqualsDemo {

	@Test
	public void testEqualParameter() {
		
		String actual = "test data";
		String expected = "test data";
		
		// compare string
		assertEquals("String should match",expected,actual);
		
		//compare integer
		assertEquals("Integer should match",123, 123);
		
		//compare float
		assertEquals(123.25, 123.25, 0.1);
	}

	@Test
	public void testArrayEqualsParameter() {
		
		String[] s1 = {"test data", "new data"};
		String[] s2 = {"test data", "new data"};
		assertArrayEquals(s1,s2);
		
		assertArrayEquals(Arrays.asList(123, 456).toArray(), Arrays.asList(123, 456).toArray());
		
		assertArrayEquals("Array data should match",new double[] {20.0}, new double[] {20.0}, 0.1);
		
		assertArrayEquals(Collections.singletonList(20L).toArray(), Collections.singletonList(20L).toArray());
	}
	
	
}
