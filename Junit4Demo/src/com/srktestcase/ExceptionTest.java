package com.srktestcase;

import org.junit.Before;
import org.junit.Test;

public class ExceptionTest {

	@Before
	public void setUp() {
		System.out.println("--- Running set up method ---");
	}
	
	@Test(expected = Exception.class)
	public void testExample() throws Exception {
		System.out.println("--- Running test method ");
		throw new Exception("Exception thrown");
	}

}
