package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.getCount());
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.getCount());
		System.out.println();

	}

}
