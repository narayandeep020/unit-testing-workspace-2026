package com.casting;

public class CastingDemo2 {

	public static void main(String[] args) {

		Box b1 = new Box(10);
		Box b2 = new Box("Java");
		Box b3 = new Box(true);

		// Down casting
		Integer x = (Integer) b1.getValue();
		String s = (String) b2.getValue();
		Boolean b = (Boolean) b3.getValue();

		System.out.println(x + 5);
		System.out.println(s + 5);
		System.out.println(b);
	}

}

class Box {
	private Object value;

	public Box(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
