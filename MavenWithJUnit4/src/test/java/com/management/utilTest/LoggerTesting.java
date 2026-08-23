package com.management.utilTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.management.util.LoggerTest;

public class LoggerTesting {

	@Test
	public void testMainLogsAllLevels() {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
		LoggerTest.main(new String[] {});
		System.setOut(originalOut);
		

	}

}
