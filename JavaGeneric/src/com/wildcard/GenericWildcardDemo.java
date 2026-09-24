package com.wildcard;

import java.util.ArrayList;
import java.util.List;

//invariant in generic
abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing circle");
	}
}

public class GenericWildcardDemo {

	public static void drawShape(List<? extends Shape> lists) {
		for (Shape sh : lists) {
			sh.draw();
		}
	}

	public static void main(String[] args) {

		List<Rectangle> list1 = new ArrayList<>();
		list1.add(new Rectangle());

		List<Circle> list2 = new ArrayList<>();
		list2.add(new Circle());
		list2.add(new Circle());

		drawShape(list1);
		drawShape(list2);
	}

}
