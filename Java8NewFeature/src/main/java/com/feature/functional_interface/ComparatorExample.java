package com.feature.functional_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie2 {
	private String name;
	private double rating;
	private int year;

	public Movie2(String name, double rating, int year) {
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

	@Override
	public String toString() {
		return "Movie2 [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}
}

//Comparator to sort movies by rating
class Rating implements Comparator<Movie2> {

	@Override
	public int compare(Movie2 m1, Movie2 m2) {
		// Sort by rating in descending order
		return Double.compare(m2.getRating(), m1.getRating());
	}

}

//Comparator to sort movies by name
class NameCompare implements Comparator<Movie2> {

	@Override
	public int compare(Movie2 m1, Movie2 m2) {
		// Sort by name in alphabetical order
		return m1.getName().compareTo(m2.getName());
	}

}

public class ComparatorExample {

	public static void main(String[] args) {
		Movie2 m1 = new Movie2("Force Awakens", 8.3, 2015);
		Movie2 m2 = new Movie2("Star Wars", 8.7, 1977);
		Movie2 m3 = new Movie2("Empire Strikes Back", 8.8, 1980);

		List<Movie2> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);

		// Sorting on multiple fields Group by
		Comparator<Movie2> groupByComparator = Comparator.comparing(Movie2::getRating).thenComparing(Movie2::getName);
		list.sort(groupByComparator);
		System.out.println("List: " + list);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		// Sort movies by rating and display all
		Collections.sort(list, new Rating());
		System.out.println("Movie2 sorted by rating: ");
		for (Movie2 moo : list) {
			System.out.println(moo.getRating() + " " + moo.getName() + " " + moo.getYear());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		// Sort movies by name and display all
		Collections.sort(list, new NameCompare());
		System.out.println("Movie2 sorted by name: ");
		for (Movie2 moo : list) {
			System.out.println(moo.getName() + " " + moo.getRating() + " " + moo.getYear());
		}
	}
}
