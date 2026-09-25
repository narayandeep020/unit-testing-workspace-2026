package com.feature.base64;

import java.util.Base64;

public class BasicEncodeDecode {

	public static void main(String[] args) {
		// Getting encoder
		Base64.Encoder encode = Base64.getEncoder();

		byte[] arr1 = { 1, 2 }; // Creating byte array
		byte[] arr2 = encode.encode(arr1); // Encoding byte array
		System.out.println("Encoded byte array: " + arr2);

		byte[] arr3 = new byte[5];
		int x = encode.encode(arr1, arr3);// Encoding into another byte array
		System.out.println("Encoded byte array written to another array: " + arr3);
		System.out.println("Number of bytes written: " + x);

		String str = encode.encodeToString("Welcome".getBytes());// Encoding string
		System.out.println("Encoding String: " + str);

		// Getting decoder
		Base64.Decoder decode = Base64.getDecoder();

		String str2 = new String(decode.decode(str));
		System.out.println("Decoded String: " + str2);
	}

}

// encode()
// decode()