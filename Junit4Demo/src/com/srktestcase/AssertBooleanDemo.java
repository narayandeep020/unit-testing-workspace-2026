package com.srktestcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertBooleanDemo {

	@Test
	public void testAssertTrue() {
		assertTrue(2 > 0);
	}
	
	@Test
	public void testAssertTrueWithMessage() {
		assertTrue("Condition should be true",2 > 0);
	}

	@Test
	public void testAssertFalse() {
		assertFalse(2 == 0);
	}
	
	@Test
	public void testAssertFalseWithMessage() {
		assertFalse("Condition should be true",2 == 0);
	}
}
