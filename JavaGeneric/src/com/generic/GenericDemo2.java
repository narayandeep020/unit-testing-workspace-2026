package com.generic;

public class GenericDemo2 {

	public static void main(String[] args) {
		MyGen<Integer> m1 = new MyGen<>();
		m1.setObj(12);
		System.out.println(m1.getObj());

		MyGen<String> m2 = new MyGen<>();
		m2.setObj("Hello");
		System.out.println(m2.getObj());
	}
}

class MyGen<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}