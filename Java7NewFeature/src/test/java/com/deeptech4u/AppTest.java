package com.deeptech4u;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void testApp() {
		byte b1 = 0b010;
		byte b2 = 0B010;
		assertEquals(4, b1 + b2);
	}
}
