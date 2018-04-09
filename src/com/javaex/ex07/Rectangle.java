package com.javaex.ex07;

public class Rectangle {

	private String lineColor;
	private String fillColor;
	private int width;
	private int height;

	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		super();
	}
	public void draw() {
		System.out.println("LColor=" + lineColor + "FColor=" + fillColor + " 가로=" + width + " 세로=" + height + "사각형을 그렸습니다.");
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
