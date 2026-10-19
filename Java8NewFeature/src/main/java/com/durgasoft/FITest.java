package com.durgasoft;

interface Interf {
	void m1(int i);
//	void m2(int j); if we define more than one abstract method in functional interface lambda expression will not work.
}

public class FITest {

	public static void main(String[] args) {

		Interf in = i -> System.out.println(i * i);
		in.m1(10);
	}

}
