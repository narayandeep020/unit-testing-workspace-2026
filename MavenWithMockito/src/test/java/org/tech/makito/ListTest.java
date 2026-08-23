package org.tech.makito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

@SuppressWarnings("rawtypes")
public class ListTest {
	@Test
	public void letsMockListSize() {
		List list = mock(List.class);
		when(list.size()).thenReturn(2);
			
		assertEquals(2, list.size());
	}
	
	@Test
	public void letsMockListSize_ReturnMultipleValues() {
		List list = mock(List.class);
		when(list.size()).thenReturn(2, 3);
		
		assertEquals(2, list.size());
		assertEquals(3, list.size());
	}
	
	@Test
	public void letsMockListGet() {
		List list = mock(List.class);
		when(list.get(0)).thenReturn("deeptech4u");
		
		assertEquals("deeptech4u", list.get(0));
		assertEquals(null, list.get(1));
		assertNull(list.get(2));
	}
	
	@Test
	public void letsMockListGet2() {
		List list = mock(List.class);
		when(list.get(anyInt())).thenReturn("deeptech4u");
		
		assertEquals("deeptech4u", list.get(0));
		assertEquals("deeptech4u", list.get(1));
	}
	
	@Test(expected = RuntimeException.class)
	public void letsMockList_throwException() {
		List list = mock(List.class);
		when(list.get(anyInt())).thenThrow(new RuntimeException("Somthing went wroung"));
		
		list.get(0);
	}
}

