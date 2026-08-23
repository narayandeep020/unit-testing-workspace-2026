package com.management.utilTest;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.management.util.AppUtil;

public class AppUtilTest {

	@Test
	public void testInputStreamToByte_withNormalData() throws IOException {
		String testData = "Hello JUnit4!";
		InputStream input = new ByteArrayInputStream(testData.getBytes());

		byte[] result = AppUtil.InputStreamToBytes(input);
		
		assertNotNull(result);
		assertEquals(testData, new String(result));
	}
	
	@Test
	public void testInputStreamToByte_emptyStream() throws IOException {
		InputStream input = new ByteArrayInputStream(new byte[0]);
		
		byte[] result = AppUtil.InputStreamToBytes(input);
		
		assertNotNull(result);
		assertEquals(0, result.length);
	}
	
	@Test
	public void testInputStreamToByte_largeData() throws IOException {
		byte[] largeData = new byte[5000];
		for(int i=0; i<largeData.length; i++) {
			largeData[i] = (byte) (i % 256);
		}
		InputStream input = new ByteArrayInputStream(largeData);
		
		byte[] result = AppUtil.InputStreamToBytes(input);
		
		assertArrayEquals(largeData, result);
	}
	
	@Test(expected = IOException.class)
	 public void testInputStreamToBytes_withException() throws IOException {
		InputStream in = new InputStream() {
		
		public int read() throws IOException {
			throw new IOException("Stream error");
		}
	};
	
	AppUtil.InputStreamToBytes(in);
	}
}

