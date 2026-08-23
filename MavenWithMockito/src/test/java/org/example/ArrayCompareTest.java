package org.example;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testSortArray() {
		int[] number = {4,2,5,15};
		int[] expected = {2,4,5,15};
		
		Arrays.sort(number);
		assertArrayEquals(expected,number);
	}
	
	@Test(expected = NullPointerException.class)
	public void testSortNullArray() {
		int[] number = null;
		Arrays.sort(number);
	}
	
	@Test(timeout = 100)
	public void testSortArray_performance() {
		   int[] num= {14,17,13,10,0,21};
		   for(int i=0; i< 1000; i++) {
			   num[0]=i;
			   Arrays.sort(num);
		   } 
	}
}
