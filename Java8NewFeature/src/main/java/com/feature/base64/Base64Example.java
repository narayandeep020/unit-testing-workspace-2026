package com.feature.base64;

import java.util.Base64;

public class Base64Example {

	public static void main(String[] args) {
// Encoding Data into Base64

		String text = "OpenAI Rocks!!";
		byte[] textByte = text.getBytes();
		String encodeText = Base64.getEncoder().encodeToString(textByte);
		System.out.println(encodeText);

		String text2 = "Java is fun programming";
		String encodeText2 = Base64.getEncoder().encodeToString(text2.getBytes());
		System.out.println(encodeText2);
		System.out.println("-----------------------------");

// Decoding Data from Base64

		String encodeData = "T3BlbkFJIFJvY2tzISE=";
		byte[] decodedByte = Base64.getDecoder().decode(encodeData);
		String result = new String(decodedByte);
		System.out.println(result);

		String encoded2 = "SmF2YSBpcyBmdW4gcHJvZ3JhbW1pbmc=";
		String result2 = new String(Base64.getDecoder().decode(encoded2));
		System.out.println(result2);
	}

}

// getEncoder()
// getDecoder()
// encodeToString()
// decode()