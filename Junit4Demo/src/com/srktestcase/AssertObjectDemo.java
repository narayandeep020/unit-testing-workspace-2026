package com.srktestcase;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
public class AssertObjectDemo {

	@Test
	public void testAssertNull() {
		
		String obj = null;
		assertNull(obj);
	}

	@Test
	public void testAssertNotNull() {
		
		String obj = "Hello Junit test";
		assertNotNull(obj);
	}
	
	@Test
	public void testAssertSame() {
		
		String obj1 = "abc";
		String obj2 = "abc";
		assertSame(obj1, obj2);
	}
	
	@Test
	public void testAssertNotSame() {
		
		Object car = new Object();
		Object bike = new Object();
		
		assertNotSame(car, bike);
	}

	  @SuppressWarnings("deprecation")
	@Test
	  public void testAssertThatHasItems() {
	    assertThat(Arrays.asList("one", "two", "three"), hasItems("one"));
	  }

}
