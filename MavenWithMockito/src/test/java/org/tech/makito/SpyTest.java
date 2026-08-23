package org.tech.makito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyTest {

	@Test
	public void createSpyOnArrayList() {
		@SuppressWarnings("unchecked")
		List<String> listSpy = spy(ArrayList.class);
		listSpy.add("Ranga");
		listSpy.add("deeptech4u");
		
		verify(listSpy).add("Ranga");
		verify(listSpy).add("deeptech4u");
		
		assertEquals(2, listSpy.size());
		assertEquals("Ranga", listSpy.get(0));
	}

}
