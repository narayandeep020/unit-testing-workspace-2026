package com.java7.newFeature;

import java.io.FileOutputStream;

public class TryWithResources {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("E:\\application_secret\\abc.txt")) {
			String msg = "Welcome to TpointTech Java Tutorial";

			byte byteArray[] = msg.getBytes();
			fos.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally executes after closing of declared resources.");
		}
	}
}
