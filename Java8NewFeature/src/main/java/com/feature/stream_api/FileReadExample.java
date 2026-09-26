package com.feature.stream_api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadExample {

	private static List<String> filterAndConvertToUpper(List<String> lines, int length) {
		// Create a new ArrayList to store filtered and modified strings
		List<String> filteredString = new ArrayList<>();

		for (String line : lines) {
			// Check if the length of the string equals the specified length
			if (line.length() == length) {
				// Convert the string to uppercase and add it to the list of filtered strings
				filteredString.add(line.toUpperCase());
			}
		}
		return filteredString;
	}

	public static void main(String[] args) {
		// Specify the path to the file that will be read
		String filePath = "E:\\application_secret\\abc.txt";

		// Initialize a new ArrayList to store the lines read from the file
		List<String> lists = new ArrayList<>();

		// Use try-with-resources to ensure the BufferedReader is closed properly
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				lists.add(line);
				System.out.println("Read Line: " + line);
			}
			List<String> filterString = filterAndConvertToUpper(lists, 5);
			// Print out the list of filtered and converted strings
			System.out.println("Filtered strings with length 5 (converted to uppercase): " + filterString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
