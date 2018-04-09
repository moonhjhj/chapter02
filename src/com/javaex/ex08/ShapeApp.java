package com.javaex.ex08;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*******인터페이스 drawable을 배열로*******/
		Drawable[] dArray = new Drawable[4];
		Drawable d01 = new Rectangle("빨강", "빨강", 7, 7);
		Drawable d02 = new Triangle("초록", "초록", 5, 5);
		Drawable d03 = new Circle("노랑", "노랑", 10);
		Drawable d04 = new Point(3, 3);
		
		dArray[0] = d01;
		dArray[1] = d02;
		dArray[2] = d03;
		dArray[3] = d04;
		
		for(int i = 0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		/***현재 시야가 interface인 drawable에만 맞춰져 있으므로 강제로 Shape(Triangle, Rectangle, Circle, Point)까지 시야를 넓혀주는거*****/
		for(int i = 0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println( ((Shape)dArray[i]).area());;
			}
		}
		

		
		/*
		*//*********섞어쓰기**********//*
		Shape[] sArray = new Shape[3];

		Shape s01 = new Rectangle("빨강", "빨강", 7, 7);
		Shape s02 = new Triangle("파랑", "파랑", 9, 9);
		Shape s03 = new Circle("노랑", "노랑", 10);
		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;
		for(int i = 0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		for(int i = 0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}*/
		//shape에 draw를 만들어주면 자식class에 있는 draw가 덮어쓰게 되면서 draw 사용 가능해짐.
		//Rectangle[] rArray = new Rectangle[3];
		// Rectangle r01 = new Rectangle("빨강", "빨강", 7, 7);
		// Rectangle r02 = new Rectangle("파랑", "파랑", 9, 9);
		// Rectangle r03 = new Rectangle("초록", "초록", 1, 1);

		//rArray[0] = r01;
		//rArray[1] = r02;
		//rArray[2] = r03;

		/*for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
*/
	}

}
