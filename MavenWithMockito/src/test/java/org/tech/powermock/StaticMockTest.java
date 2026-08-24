package org.tech.powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


import static org.powermock.api.mockito.PowerMockito.*;
import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticUtil.class)
public class StaticMockTest {

	@Test
	public void testStaticMethod() {
		mockStatic(StaticUtil.class);
		
		when(StaticUtil.getMessage()).thenReturn("Mocked Message");
		
		assertEquals("Mocked Message", StaticUtil.getMessage());
	}

}
