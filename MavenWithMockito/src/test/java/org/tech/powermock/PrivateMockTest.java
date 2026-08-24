package org.tech.powermock;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PrivateService.class)
public class PrivateMockTest {

	 @Test
	    public void testPrivateMethod() throws Exception {
	        PrivateService service = spy(new PrivateService());

	        when(service, "secretMethod").thenReturn("Mocked Secret");

	        String result = service.callSecret();
	        assertEquals("Mocked Secret", result);
	    }

}
