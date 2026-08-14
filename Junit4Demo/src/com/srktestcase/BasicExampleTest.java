package com.srktestcase;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicExampleTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("--- Running before class method ---");
	}
	
	@Before
	public void setUp() {
		System.out.println("--- Running set up method ---");
	}
	
	@Test
	public void testExampleOne() {
		System.out.println("--- Running test example one method ---");
	}
	
	@Test
	public void testExampleTwo() {
		System.out.println("--- Running test example two method");
	}

	@After
	public void tearDown() {
		System.out.println("--- Running tear down method ---");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("--- Running after class method ---");
	}
}
