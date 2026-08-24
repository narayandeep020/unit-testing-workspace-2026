package org.tech.powermock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ SystemUnderTest.class})
public class PowerMockingConstructorTest {

	private static final int SOME_DUMMY_SIZE = 100;

	@Mock
	Dependency dependencyMock;

	@InjectMocks
	SystemUnderTest systemUnderTest;

	@Test
	public void powerMockito_MockingAConstructor() throws Exception {
		@SuppressWarnings("unchecked")
		ArrayList<String> mockList = mock(ArrayList.class);

		when(mockList.size()).thenReturn(SOME_DUMMY_SIZE);

		PowerMockito.whenNew(ArrayList.class).withAnyArguments().thenReturn(mockList);

		int size = systemUnderTest.methodUsingAnArrayListConstructor();

		assertEquals(SOME_DUMMY_SIZE, size);
	}
}
