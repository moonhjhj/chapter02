package com.javaex.ex04;

public class Goods {

	private String name;
	private int price;
	private static int count;

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		plusCount();
	}

	private void plusCount() {
		count = count + 1;
	}

	public int getCount() {
		return count;
	}
	
	
}
