package com.feature.base64;

import java.util.Base64;

public class UrlEncodeDecode {

	public static void main(String[] args) {
		// Getting Encoder
		Base64.Encoder encode = Base64.getUrlEncoder();

		String str1 = encode.encodeToString("https://www.tpointtech.com/".getBytes());
		System.out.println("Encoded URL: " + str1);

		// Getting Decoder
		Base64.Decoder decode = Base64.getUrlDecoder();

		String str2 = new String(decode.decode(str1));
		System.out.println("Decoded URL: " + str2);
	}

}
