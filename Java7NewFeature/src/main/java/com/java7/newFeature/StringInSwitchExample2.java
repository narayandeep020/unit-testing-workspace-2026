package com.java7.newFeature;

public class StringInSwitchExample2 {

	public static void main(String[] args) {
		String game = "Card-Games";

		switch (game) {
		case "Hocket":
		case "Cricket":
		case "Football":
			System.out.println("This is outdoor game");
			break;
		case "Chess":
		case "Card-Games":
		case "Puzzles":
			System.out.println("This is indoor game");
			break;
		default:
			System.out.println("What game it is?");
		}
	}
}
