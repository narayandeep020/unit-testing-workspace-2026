package com.mockito;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class SpyExampleTest {

    @Spy
    List<String> spiedList = new ArrayList<>();

    @Test
    public void testSpy() {
        spiedList.add("Real Value");

        assertEquals("Real Value", spiedList.get(0));

        when(spiedList.size()).thenReturn(100);
        assertEquals(100, spiedList.size());
    }
}
