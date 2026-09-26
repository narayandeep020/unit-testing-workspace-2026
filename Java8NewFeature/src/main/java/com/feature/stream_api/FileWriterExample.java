package com.feature.stream_api;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWriterExample {

	public static void main(String[] args) {
		String[] phrases = { "Sample", "Text", "For", "File", "Write" };
		String filePath = "E:\\application_secret\\sample.txt";

		// Attempt to open the file and write phrases to it
		try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(filePath)))) {

			// Writing each string from the array to the file using a stream
			Stream.of(phrases).forEach(writer::println);

			System.out.println("Text has been successfully written to the file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
