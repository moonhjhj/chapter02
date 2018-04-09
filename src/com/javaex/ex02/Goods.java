package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;

/************** 생성자 *************************/
	public Goods() {
	}

	/*public Goods(String name, int price) {

		this.name = name;
		this.price = price;
	}
*/	
	public Goods(String name) {
		this.name = name;
	}
	
	public Goods(String name, int price) {
		this(name);
		this.price = price;
	}
/* ========================================= */
	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public void setName(String n) {
		name = n;
	}

	public void setPrice(int p) {
		price = p;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void showinfo() {
		System.out.println("상품이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("=================");
	}

}
