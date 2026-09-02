package com.mockito;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Captor;
import org.mockito.ArgumentCaptor;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CaptorExampleTest {

    @Mock
    List<String> mockedList;

    @Captor
    ArgumentCaptor<String> stringCaptor;

    @Test
    public void testCaptor() {
        mockedList.add("Captured Value");

        verify(mockedList).add(stringCaptor.capture());
        assertEquals("Captured Value", stringCaptor.getValue());
    }
}
