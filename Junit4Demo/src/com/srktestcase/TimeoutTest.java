package com.srktestcase;

import org.junit.Before;
import org.junit.Test;

public class TimeoutTest {

	@Before
	public void setUp() {
		System.out.println("--- Running set up method ---");
	}

	@Test(timeout = 1000)
	public void testExample() throws InterruptedException {
		System.out.println("--- Rinning test method ---");
		System.out.println("failing test after 1000 ms");
		Thread.sleep(2000);
	}

	@Test
	public void testExampleTwo() {
		System.out.println("--- Running test two method ---");
	}

}
