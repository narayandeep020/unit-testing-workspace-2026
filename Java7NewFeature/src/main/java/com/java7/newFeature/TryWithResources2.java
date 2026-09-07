package com.java7.newFeature;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithResources2 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("E:\\application_secret\\abc.txt");
				InputStream input = new FileInputStream("E:\\application_secret\\abc.txt")) {
			String msg = "Welcome to TpointTech Java Tutorial";

			byte byteArray[] = msg.getBytes();
			fos.write(byteArray);
			System.out.println("~~~~~~Data written into file~~~~~~~");
			System.out.println(msg);

			DataInputStream dis = new DataInputStream(input);
			int data = input.available();

			byte arr[] = new byte[data];
			dis.read(arr);
			String str = new String(arr);
			System.out.println("~~~~~~~Data read from file~~~~~~~~");
			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
