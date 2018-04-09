package com.javaex.ex08;

public class Rectangle extends Shape implements Drawable{
	
	private int width;
	private int height;
	
	public Rectangle() {
	}
	
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor); //shape에서 상속받았으니까 적어줌
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}

	public void draw() {
		System.out.println("LColor=" + lineColor + "FColor=" + fillColor + " 가로=" + width + " 세로=" + height + " 사각형을 그렸습니다.");
	}
	
	public double area() {
		return width*height;
	}

	

	
	
	

}
