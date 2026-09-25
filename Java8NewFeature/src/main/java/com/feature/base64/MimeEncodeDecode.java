package com.feature.base64;

import java.util.Base64;

public class MimeEncodeDecode {

	public static void main(String[] args) {
		// Getting MIME encoder
		Base64.Encoder encode = Base64.getMimeEncoder();

		String message = "Hello,\nwe are informed regarding our inconsistency of work";
		String eStr = encode.encodeToString(message.getBytes());
		System.out.println("Encoded message: " + eStr);

		// Getting MIME decoder
		Base64.Decoder decode = Base64.getMimeDecoder();

		String dStr = new String(decode.decode(eStr));
		System.out.println("Decoded message: " + dStr);
	}

}
