package com.javaex.ex07;

public class ShapeApp {

	public static void main(String[] args) {

		/******* 배열 안에 Triangle만 담기. 배열 안에 Triangle 주소값 넣기 ********/
		Triangle[] tArray = new Triangle[3]; // 배열은 new Triangle[여기에 갯수 적어줘야 함], 그릴 때 for문으로 한번에 그릴 수 있음.

		Triangle t01 = new Triangle("빨강", "빨강", 3, 3);
		Triangle t02 = new Triangle("파랑", "파랑", 5, 5);
		Triangle t03 = new Triangle("초록", "초록", 10, 10);
		tArray[0] = t01; // 배열에 Triangle 주소값 넣기. t01은 실제 삼각형이 아니라 주소값을 가지고 있음.
		tArray[1] = t02;
		tArray[2] = t03;

		for(int i = 0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		//t01.draw();

		/****** 입력한 값들이 잘 들어갔나 확인하기 위한 toString(개발자들이 그냥 보기 위한 용도) *******/
		// System.out.println(t01.toString());
		// System.out.println(t02.toString());
		
		Rectangle[] rArray = new Rectangle[3];
		Rectangle r01 = new Rectangle("빨강", "빨강", 4, 4);
		Rectangle r02 = new Rectangle("파랑", "파랑", 6, 6);
		Rectangle r03 = new Rectangle("초록", "초록", 8, 8);
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i = 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		

	}

}
