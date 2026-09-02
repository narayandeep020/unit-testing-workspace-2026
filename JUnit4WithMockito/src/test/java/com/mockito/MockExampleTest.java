package com.mockito;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MockExampleTest {

    @Mock
    List<String> mockedList;

    @Test
    public void testMock() {
        when(mockedList.get(0)).thenReturn("Hello");

        assertEquals("Hello", mockedList.get(0));
        verify(mockedList).get(0);
    }
}
