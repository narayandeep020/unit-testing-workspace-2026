package com.durgasoft;

import java.time.Year;
import java.util.Scanner;

public class YearExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year Number: ");
		int d = sc.nextInt();

		Year y = Year.of(d);
		if (y.isLeap()) {
			System.out.printf("%d Year is leap year", d);
		} else {
			System.out.printf("%d Year is not leap year", d);
		}
		sc.close();
	}
}
