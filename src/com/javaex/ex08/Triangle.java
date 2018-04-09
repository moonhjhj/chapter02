package com.javaex.ex08;

public class Triangle extends Shape implements Drawable{
	
	protected int width;
	protected int height;
	
	public Triangle() {
	
	}
	public Triangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}


	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	public void draw() {
		System.out.println("LColor=" + lineColor + "FColor=" + fillColor + " 가로=" + width + " 세로=" + height + " 삼각형을 그렸습니다.");
	}
	public double area() {
		return width*height/2;
	}
	
	
	

}
