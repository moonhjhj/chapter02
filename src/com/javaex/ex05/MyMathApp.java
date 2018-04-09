package com.javaex.ex05;

public class MyMathApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*static으로 plus 올린것. MyMath 틀 이름 그대로 사용*/
		int r01 = MyMath.plus(3, 5);
		System.out.println(r01);
		
		double r02 = MyMath.plus(5.3, 6.2);
		System.out.println(r02);
		
		/*static으로 올리기 전. myMath*/
		/*MyMath myMath = new MyMath();
		int r01 = myMath.plus(2,4);
		System.out.println(r01);
		
		double r02 = myMath.plus(5.3, 6.2);
		System.out.println(r02);
*/

	}

}
