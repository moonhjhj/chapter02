package com.javaex.ex01class;

public class Point {

	private int xpoint;
	private int ypoint;

	public void setXpoint(int xpoint) {
		this.xpoint = xpoint;
	}

	public int getXpoint() {
		return xpoint;
	}

	public void setYpoint(int ypoint) {
		this.ypoint = ypoint;
	}

	public int getYpoint() {
		return ypoint;
	}

	public void draw() {
		System.out.println("점[x=" + xpoint + "," + "y=" + ypoint + "] 를 그렸습니다.");
		System.out.println("점[x=" + xpoint + "," + "y=" + ypoint + "] 를 지웠습니다.");
	}

}
