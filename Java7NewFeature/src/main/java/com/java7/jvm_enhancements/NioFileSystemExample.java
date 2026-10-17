package com.java7.jvm_enhancements;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class NioFileSystemExample {

	static Path filePath = Paths.get("E:\\2026_java_notes\\niodemo.txt");
	static Path dirPath = Paths.get("D:\\");

	public static void main(String[] args) {
		readAllLinesAtOnce();
		readLargeFileSequentially();
		readFolders();
		readRecursiveFolderExample();
	}

	private static void readAllLinesAtOnce() {

		try {
			List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void readLargeFileSequentially() {

		try (BufferedReader br = Files.newBufferedReader(filePath)) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readFolders() {

		try (DirectoryStream<Path> ds = Files.newDirectoryStream(dirPath)) {
			for (Path entry : ds) {
				String type = Files.isDirectory(entry) ? "[DIR]" : "[FILE]";
				System.out.println(type + " " + entry.getFileName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readRecursiveFolderExample() {

		try {
			Files.walkFileTree(dirPath, new SimpleFileVisitor<Path>() {
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					System.out.println("File: " + file);
					return FileVisitResult.CONTINUE;
				}

				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
					System.out.println("Directory: " + dir);
					return FileVisitResult.CONTINUE;
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
