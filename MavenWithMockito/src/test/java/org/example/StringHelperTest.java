package org.example;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class StringHelperTest {
	
	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AInfirst2Position() {	
		String actual = helper.truncateAInFirst2Positions("AACD");
		assertEquals("CD",actual);
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInfirstPosition() {
		assertEquals("BCD",helper.truncateAInFirst2Positions("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_positive1() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("DEVDE"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_positive2() {
	 assertTrue( helper.areFirstAndLastTwoCharactersTheSame("DALDA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_negative1() {
	 assertFalse( helper.areFirstAndLastTwoCharactersTheSame("DEEPU"));
	}
	
	@Test
	public void testEqualString() {
		// assertEquals(expected, actual);
		assertEquals("Devendra", "Devendra");
	}

}
