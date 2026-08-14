package com.test.java;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.main.java.MyPrinter;

public class MyPrinterTest {

	@Test
	public void testLogMessagePrintToConsole() {
		
		ByteArrayOutputStream  outStream = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		
		System.setOut(new PrintStream(outStream));
		
		MyPrinter printer = new MyPrinter();
		try {
			printer.printHello();
			assertEquals("HelloJava",outStream.toString());
		}finally {
			System.setOut(originalOut);
		}
	}

}
