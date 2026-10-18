package com.feature.functional_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {
	private String name;
	private double rating;
	private int year;

	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	// Implementation of the compareTo method for default sorting by year
	@Override
	public int compareTo(Movie m) {
		// Sort movies in ascending order of year
		return this.year - m.year;
	}
}

public class ComparableExample {

	public static void main(String[] args) {

		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movie after sorting by year: ");

		for (Movie m : list) {
			System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
		}
	}
}
