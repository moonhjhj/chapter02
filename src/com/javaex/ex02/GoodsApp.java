package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*****************생성자****************/
		Goods pen = new Goods("볼펜", 1000);
		pen.showinfo();
	
/*=========================================*/
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);

		// computer.name = "LG그램";
		// computer.price = 900000;

		Goods cup = new Goods();
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		/*cup.name = "머그컵";
		cup.price = 2000;*/
		
		
		
/******************출력********************************/
		computer.showinfo();
		cup.showinfo();
		/*System.out.println("상품이름:" + computer.getName());
		System.out.println("가격:" + computer.getPrice());
		System.out.println("----------------");
		System.out.println("상품이름:" + cup.getName());
		System.out.println("가격:" + cup.getPrice());*/
		/*System.out.println("상품이름 : " + computer.name + "," + "\t" + "가격 : " + computer.price);
		System.out.println("상품이름 : " + cup.name + "," + "\t" + "가격 : " + cup.price);*/

	}

}
